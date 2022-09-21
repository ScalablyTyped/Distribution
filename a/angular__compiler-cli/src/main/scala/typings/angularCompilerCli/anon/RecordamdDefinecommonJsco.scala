package typings.angularCompilerCli.anon

import typings.typescript.mod.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'amdDefine' | 'commonJs' | 'commonJs2' | 'global', typescript.typescript.CallExpression | null> & {  cjsCallForImports :typescript.typescript.CallExpression} */
trait RecordamdDefinecommonJsco extends StObject {
  
  var amdDefine: CallExpression | Null
  
  var cjsCallForImports: CallExpression
  
  var commonJs: CallExpression | Null
  
  var commonJs2: CallExpression | Null
  
  var global: CallExpression | Null
}
object RecordamdDefinecommonJsco {
  
  inline def apply(cjsCallForImports: CallExpression): RecordamdDefinecommonJsco = {
    val __obj = js.Dynamic.literal(cjsCallForImports = cjsCallForImports.asInstanceOf[js.Any], amdDefine = null, commonJs = null, commonJs2 = null, global = null)
    __obj.asInstanceOf[RecordamdDefinecommonJsco]
  }
  
  extension [Self <: RecordamdDefinecommonJsco](x: Self) {
    
    inline def setAmdDefine(value: CallExpression): Self = StObject.set(x, "amdDefine", value.asInstanceOf[js.Any])
    
    inline def setAmdDefineNull: Self = StObject.set(x, "amdDefine", null)
    
    inline def setCjsCallForImports(value: CallExpression): Self = StObject.set(x, "cjsCallForImports", value.asInstanceOf[js.Any])
    
    inline def setCommonJs(value: CallExpression): Self = StObject.set(x, "commonJs", value.asInstanceOf[js.Any])
    
    inline def setCommonJs2(value: CallExpression): Self = StObject.set(x, "commonJs2", value.asInstanceOf[js.Any])
    
    inline def setCommonJs2Null: Self = StObject.set(x, "commonJs2", null)
    
    inline def setCommonJsNull: Self = StObject.set(x, "commonJs", null)
    
    inline def setGlobal(value: CallExpression): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalNull: Self = StObject.set(x, "global", null)
  }
}
