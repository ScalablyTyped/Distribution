package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a rule to format numberings.
  *
  * It is normally represented by a sequence of {@link com.sun.star.beans.PropertyValues} .
  */
@js.native
trait NumberingRule
  extends NumberingAlignment
     with NumberingLevel

object NumberingRule {
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    BulletFontName: String,
    BulletId: Double,
    CharStyleName: String,
    GraphicURL: String,
    Insertion: Double,
    NumberingType: Double,
    ParentNumbering: Double,
    Prefix: String,
    StartWith: Double,
    Suffix: String,
    TextMarginDistance: Double,
    TextNumberingDistance: Double
  ): NumberingRule = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], BulletFontName = BulletFontName.asInstanceOf[js.Any], BulletId = BulletId.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], GraphicURL = GraphicURL.asInstanceOf[js.Any], Insertion = Insertion.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], ParentNumbering = ParentNumbering.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], StartWith = StartWith.asInstanceOf[js.Any], Suffix = Suffix.asInstanceOf[js.Any], TextMarginDistance = TextMarginDistance.asInstanceOf[js.Any], TextNumberingDistance = TextNumberingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingRule]
  }
}

