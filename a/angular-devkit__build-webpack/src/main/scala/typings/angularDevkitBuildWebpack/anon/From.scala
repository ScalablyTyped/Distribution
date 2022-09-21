package typings.angularDevkitBuildWebpack.anon

import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.rename
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.angularDevkitBuildWebpack.testMod.test.TestLogRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From
  extends StObject
     with TestLogRecord {
  
  var from: Path_
  
  var kind: rename
  
  var to: Path_
}
object From {
  
  inline def apply(from: Path_, to: Path_): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], kind = "rename", to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: Path_): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setKind(value: rename): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Path_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
