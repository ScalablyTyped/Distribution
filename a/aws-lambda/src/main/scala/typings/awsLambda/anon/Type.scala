package typings.awsLambda.anon

import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildCacheType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: CodeBuildCacheType
}
object Type {
  
  inline def apply(`type`: CodeBuildCacheType): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: CodeBuildCacheType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
