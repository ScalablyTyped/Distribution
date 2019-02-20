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

