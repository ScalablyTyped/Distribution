package typings.angularDevkitCore.anon

import typings.angularDevkitCore.angularDevkitCoreStrings.delete
import typings.angularDevkitCore.angularDevkitCoreStrings.exists
import typings.angularDevkitCore.angularDevkitCoreStrings.isDirectory
import typings.angularDevkitCore.angularDevkitCoreStrings.isFile
import typings.angularDevkitCore.angularDevkitCoreStrings.list
import typings.angularDevkitCore.angularDevkitCoreStrings.read
import typings.angularDevkitCore.angularDevkitCoreStrings.stat
import typings.angularDevkitCore.angularDevkitCoreStrings.watch
import typings.angularDevkitCore.angularDevkitCoreStrings.write
import typings.angularDevkitCore.srcVirtualFsHostTestMod.test.TestLogRecord
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    inline def setKind(value: write | read | delete | list | exists | isDirectory | isFile | stat | watch): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
