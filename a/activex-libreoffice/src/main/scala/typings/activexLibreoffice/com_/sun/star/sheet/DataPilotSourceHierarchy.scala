package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a hierarchy in a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
@js.native
trait DataPilotSourceHierarchy
  extends XNamed
     with XLevelsSupplier

object DataPilotSourceHierarchy {
  @scala.inline
  def apply(
    Levels: XNameAccess,
    Name: String,
    acquire: () => Unit,
    getLevels: () => XNameAccess,
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit
  ): DataPilotSourceHierarchy = {
    val __obj = js.Dynamic.literal(Levels = Levels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLevels = js.Any.fromFunction0(getLevels), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[DataPilotSourceHierarchy]
  }
}

