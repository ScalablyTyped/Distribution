package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoShapeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceholderFormat extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val ContainedType: MsoShapeType = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PlaceholderFormat_typekey")
  var PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat = js.native
  
  val Type: PpPlaceholderType = js.native
}
object PlaceholderFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    ContainedType: MsoShapeType,
    Name: String,
    Parent: js.Any,
    PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat,
    Type: PpPlaceholderType
  ): PlaceholderFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContainedType = ContainedType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaceholderFormat_typekey")(PowerPointDotPlaceholderFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderFormat]
  }
  
  @scala.inline
  implicit class PlaceholderFormatOps[Self <: PlaceholderFormat] (val x: Self) extends AnyVal {
    
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
    def setContainedType(value: MsoShapeType): Self = this.set("ContainedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPlaceholderFormat_typekey(value: PlaceholderFormat): Self = this.set("PowerPoint.PlaceholderFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpPlaceholderType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
