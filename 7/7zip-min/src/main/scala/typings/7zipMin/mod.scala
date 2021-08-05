package typings.`7zipMin`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("7zip-min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cmd(command: js.Array[String], errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cmd")(command.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list(
    pathToArchive: String,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Array[Result], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(pathToArchive.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pack(
    pathToDirOrFile: String,
    pathToArchive: String,
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(pathToDirOrFile.asInstanceOf[js.Any], pathToArchive.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unpack(pathToArchive: String, whereToUnpack: String, errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(pathToArchive.asInstanceOf[js.Any], whereToUnpack.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Result extends StObject {
    
    var attr: String
    
    var compressed: String
    
    var date: String
    
    var name: String
    
    var size: String
    
    var time: String
  }
  object Result {
    
    inline def apply(attr: String, compressed: String, date: String, name: String, size: String, time: String): Result = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setCompressed(value: String): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
