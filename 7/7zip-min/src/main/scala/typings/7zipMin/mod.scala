package typings.`7zipMin`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("7zip-min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cmd(command: js.Array[String], errorCallback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cmd")(command.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list(
    pathToArchive: String,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ js.Array[Result], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(pathToArchive.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pack(
    pathToDirOrFile: String,
    pathToArchive: String,
    errorCallback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(pathToDirOrFile.asInstanceOf[js.Any], pathToArchive.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unpack(pathToArchive: String, errorCallback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(pathToArchive.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpack(
    pathToArchive: String,
    whereToUnpack: String,
    errorCallback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(pathToArchive.asInstanceOf[js.Any], whereToUnpack.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Result extends StObject {
    
    var attr: String
    
    var block: String
    
    var compressed: String
    
    var crc: String
    
    var date: String
    
    var dateTime: String
    
    var encrypted: String
    
    var method: String
    
    var name: String
    
    var size: String
    
    var time: String
  }
  object Result {
    
    inline def apply(
      attr: String,
      block: String,
      compressed: String,
      crc: String,
      date: String,
      dateTime: String,
      encrypted: String,
      method: String,
      name: String,
      size: String,
      time: String
    ): Result = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], crc = crc.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setCompressed(value: String): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCrc(value: String): Self = StObject.set(x, "crc", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: String): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
