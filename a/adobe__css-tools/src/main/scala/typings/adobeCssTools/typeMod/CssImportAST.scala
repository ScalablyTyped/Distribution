package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.`import`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssImportAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var `import`: String
  
  @JSName("type")
  var type_CssImportAST: `import`
}
object CssImportAST {
  
  inline def apply(`import`: String, `type`: `import`): CssImportAST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssImportAST]
  }
  
  extension [Self <: CssImportAST](x: Self) {
    
    inline def setImport(value: String): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setType(value: `import`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
