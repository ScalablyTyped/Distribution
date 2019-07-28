package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods to create new DataPilot fields where some or all items of this DataPilot field are grouped in some way.
  * @see DataPilotField
  */
trait XDataPilotFieldGrouping extends XInterface {
  /**
    * Groups the members of this field by dates, according to the passed settings.
    *
    * If this field is already grouped by dates, a new DataPilot field will be created and returned. If this field is not grouped at all, the date grouping
    * is performed inside of this field (no new field will be created). There must not be any other grouping (by member names or by numeric ranges),
    * otherwise an exception is thrown.
    * @param aInfo contains the information how to group the items of the field. The members of this struct have to fulfill the following requirements:If the
    * @returns the new created field if there is one created. `NULL` is returned, if date grouping is performed inside this field (i.e. this field was not group
    * @see DataPilotField
    * @throws com::sun::star::lang::IllegalArgumentException if the passed struct does not contain valid settings as described, or if this field is already gro
    */
  def createDateGroup(aInfo: DataPilotFieldGroupInfo): XDataPilotField
  /**
    * Creates a new DataPilot field which contains a group containing the given DataPilot field items (members).
    *
    * It is possible to create multiple groups by calling this method several times at the same DataPilot field. On subsequent calls, the DataPilot field
    * created at the first call is used to insert the new groups.
    *
    * The collection of groups can be accessed via the {@link DataPilotField.GroupInfo} property. The returned struct contains the sequence of groups in its
    * member {@link DataPilotFieldGroupInfo.Groups} .
    * @param aItems a sequence containing the names of the items (members) which will be part of the new group. Must be names of items contained in the curren
    * @returns the new created field if there is one created on the first call of this method. `NULL` is returned on subsequent calls.
    * @see DataPilotField
    * @see DataPilotFieldGroupInfo
    */
  def createNameGroup(aItems: SeqEquiv[String]): XDataPilotField
}

object XDataPilotFieldGrouping {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDateGroup: DataPilotFieldGroupInfo => XDataPilotField,
    createNameGroup: SeqEquiv[String] => XDataPilotField,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotFieldGrouping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDateGroup = js.Any.fromFunction1(createDateGroup), createNameGroup = js.Any.fromFunction1(createNameGroup), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataPilotFieldGrouping]
  }
}

