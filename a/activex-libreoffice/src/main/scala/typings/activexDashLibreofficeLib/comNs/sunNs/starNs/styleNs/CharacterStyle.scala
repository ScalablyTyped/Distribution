package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet for characters within a {@link com.sun.star.text.Text} . */
trait CharacterStyle
  extends Style
     with CharacterProperties {
  /** This value contains the character height as difference in point to the height of the character in the parent style. */
  var CharDiffHeight: scala.Double
  /** This value contains the character height as difference in point to the height of the character in the parent style in Asian text. */
  var CharDiffHeightAsian: scala.Double
  /** This value contains the character height as difference in point to the height of the character in the parent style in complex text. */
  var CharDiffHeightComplex: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style. */
  var CharPropHeight: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in Asian text. */
  var CharPropHeightAsian: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in complex text. */
  var CharPropHeightComplex: scala.Double
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

