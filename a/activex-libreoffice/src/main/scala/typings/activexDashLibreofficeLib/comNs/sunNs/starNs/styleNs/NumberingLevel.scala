package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties describe the numbering of a paragraph.
  *
  * NumberType determines the type of the numbering symbol. Depending on this setting, some of the following values will be ignored.
  */
trait NumberingLevel extends js.Object {
  /** This is the name of the font that is used for the bullet. */
  var BulletFontName: java.lang.String
  /** The bullet symbol with this code in the assigned font is used. */
  var BulletId: scala.Double
  /** This is the name of the character style that is used for the symbol(s). */
  var CharStyleName: java.lang.String
  /** This is the URL of a graphic file to use as a symbol. */
  var GraphicURL: java.lang.String
  /**
    * specifies the type of numbering.
    * @see NumberingType
    */
  var NumberingType: scala.Double
  /** specifies the number of higher numbering levels that are included in the representation of the current number. */
  var ParentNumbering: scala.Double
  /** This prefix is inserted in front of the numbering symbol(s). */
  var Prefix: java.lang.String
  /** This specifies the start value for the numbering. */
  var StartWith: scala.Double
  /** This suffix is inserted after the numbering symbol(s). */
  var Suffix: java.lang.String
}

object NumberingLevel {
  @scala.inline
  def apply(
    BulletFontName: java.lang.String,
    BulletId: scala.Double,
    CharStyleName: java.lang.String,
    GraphicURL: java.lang.String,
    NumberingType: scala.Double,
    ParentNumbering: scala.Double,
    Prefix: java.lang.String,
    StartWith: scala.Double,
    Suffix: java.lang.String
  ): NumberingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BulletFontName")(BulletFontName)
    __obj.updateDynamic("BulletId")(BulletId)
    __obj.updateDynamic("CharStyleName")(CharStyleName)
    __obj.updateDynamic("GraphicURL")(GraphicURL)
    __obj.updateDynamic("NumberingType")(NumberingType)
    __obj.updateDynamic("ParentNumbering")(ParentNumbering)
    __obj.updateDynamic("Prefix")(Prefix)
    __obj.updateDynamic("StartWith")(StartWith)
    __obj.updateDynamic("Suffix")(Suffix)
    __obj.asInstanceOf[NumberingLevel]
  }
}

