package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to replace strings in a text described by a {@link SearchDescriptor} .
  *
  * Example: replace all bold words "search for" by "look for"
  *
  * {{program example here, see documentation}}
  */
trait XReplaceable extends XSearchable {
  /**
    * creates a descriptor which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createReplaceDescriptor(): XReplaceDescriptor
  /**
    * searches for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def replaceAll(xDesc: XSearchDescriptor): scala.Double
}

object XReplaceable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createReplaceDescriptor: js.Function0[XReplaceDescriptor],
    createSearchDescriptor: js.Function0[XSearchDescriptor],
    findAll: js.Function1[
      XSearchDescriptor, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
    ],
    findFirst: js.Function1[XSearchDescriptor, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    findNext: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      XSearchDescriptor, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceAll: js.Function1[XSearchDescriptor, scala.Double]
  ): XReplaceable = {
    val __obj = js.Dynamic.literal(acquire = acquire, createReplaceDescriptor = createReplaceDescriptor, createSearchDescriptor = createSearchDescriptor, findAll = findAll, findFirst = findFirst, findNext = findNext, queryInterface = queryInterface, release = release, replaceAll = replaceAll)
  
    __obj.asInstanceOf[XReplaceable]
  }
}

