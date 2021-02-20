package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeGrayScalePalette extends StObject {
  
  var `1`: String = js.native
  
  var `2`: String = js.native
  
  var `3`: String = js.native
  
  var `4`: String = js.native
  
  var name: String = js.native
}
object IThemeGrayScalePalette {
  
  @scala.inline
  def apply(`1`: String, `2`: String, `3`: String, `4`: String, name: String): IThemeGrayScalePalette = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeGrayScalePalette]
  }
  
  @scala.inline
  implicit class IThemeGrayScalePaletteMutableBuilder[Self <: IThemeGrayScalePalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
