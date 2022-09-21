package typings.angularDevkitBuildWebpack.anon

import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.delete
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.exists
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.isDirectory
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.isFile
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.list
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.read
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.stat
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.watch
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.write
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.angularDevkitBuildWebpack.testMod.test.TestLogRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with TestLogRecord {
  
  var kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch
  
  var path: Path_
}
object Kind {
  
  inline def apply(kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch, path: Path_): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: write | read | delete | list | exists | isDirectory | isFile | stat | watch): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
