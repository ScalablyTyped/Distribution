package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapFormat extends js.Object {
  var AllowOverlap: Double = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var DistanceBottom: Double = js.native
  var DistanceLeft: Double = js.native
  var DistanceRight: Double = js.native
  var DistanceTop: Double = js.native
  val Parent: js.Any = js.native
  var Side: WdWrapSideType = js.native
  var Type: WdWrapType = js.native
  @JSName("Word.WrapFormat_typekey")
  var WordDotWrapFormat_typekey: WrapFormat = js.native
}

object WrapFormat {
  @scala.inline
  def apply(
    AllowOverlap: Double,
    Application: Application,
    Creator: Double,
    DistanceBottom: Double,
    DistanceLeft: Double,
    DistanceRight: Double,
    DistanceTop: Double,
    Parent: js.Any,
    Side: WdWrapSideType,
    Type: WdWrapType,
    WordDotWrapFormat_typekey: WrapFormat
  ): WrapFormat = {
    val __obj = js.Dynamic.literal(AllowOverlap = AllowOverlap.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceBottom = DistanceBottom.asInstanceOf[js.Any], DistanceLeft = DistanceLeft.asInstanceOf[js.Any], DistanceRight = DistanceRight.asInstanceOf[js.Any], DistanceTop = DistanceTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Side = Side.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WrapFormat_typekey")(WordDotWrapFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapFormat]
  }
  @scala.inline
  implicit class WrapFormatOps[Self <: WrapFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowOverlap(value: Double): Self = this.set("AllowOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceBottom(value: Double): Self = this.set("DistanceBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceLeft(value: Double): Self = this.set("DistanceLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceRight(value: Double): Self = this.set("DistanceRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceTop(value: Double): Self = this.set("DistanceTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSide(value: WdWrapSideType): Self = this.set("Side", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WdWrapType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotWrapFormat_typekey(value: WrapFormat): Self = this.set("Word.WrapFormat_typekey", value.asInstanceOf[js.Any])
  }
  
}

