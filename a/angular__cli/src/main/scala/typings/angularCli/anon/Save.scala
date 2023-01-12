package typings.angularCli.anon

import typings.angularCli.srcUtilitiesPackageMetadataMod.NgAddSaveDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Save extends StObject {
  
  var save: js.UndefOr[NgAddSaveDependency] = js.undefined
}
object Save {
  
  inline def apply(): Save = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Save]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Save] (val x: Self) extends AnyVal {
    
    inline def setSave(value: NgAddSaveDependency): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
