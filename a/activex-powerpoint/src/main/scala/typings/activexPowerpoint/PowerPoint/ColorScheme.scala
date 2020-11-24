package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScheme extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def Colors(SchemeColor: PpColorSchemeIndex): RGBColor = js.native
  
  val Count: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ColorScheme_typekey")
  var PowerPointDotColorScheme_typekey: ColorScheme = js.native
}
object ColorScheme {
  
  @scala.inline
  def apply(
    Application: Application,
    Colors: PpColorSchemeIndex => RGBColor,
    Count: Double,
    Delete: () => Unit,
    Parent: js.Any,
    PowerPointDotColorScheme_typekey: ColorScheme
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Colors = js.Any.fromFunction1(Colors), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorScheme_typekey")(PowerPointDotColorScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScheme]
  }
  
  @scala.inline
  implicit class ColorSchemeOps[Self <: ColorScheme] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColors(value: PpColorSchemeIndex => RGBColor): Self = this.set("Colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotColorScheme_typekey(value: ColorScheme): Self = this.set("PowerPoint.ColorScheme_typekey", value.asInstanceOf[js.Any])
  }
}
