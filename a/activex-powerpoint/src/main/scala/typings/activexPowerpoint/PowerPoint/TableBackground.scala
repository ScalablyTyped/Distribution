package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.ReflectionFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBackground extends js.Object {
  val Fill: FillFormat
  val Picture: PictureFormat
  @JSName("PowerPoint.TableBackground_typekey")
  var PowerPointDotTableBackground_typekey: TableBackground
  val Reflection: ReflectionFormat
  val Shadow: ShadowFormat
}

object TableBackground {
  @scala.inline
  def apply(
    Fill: FillFormat,
    Picture: PictureFormat,
    PowerPointDotTableBackground_typekey: TableBackground,
    Reflection: ReflectionFormat,
    Shadow: ShadowFormat
  ): TableBackground = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableBackground_typekey")(PowerPointDotTableBackground_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBackground]
  }
}

