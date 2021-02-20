package typings.`7zipMin`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("7zip-min", "cmd")
  @js.native
  def cmd(command: js.Array[String], errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  @JSImport("7zip-min", "list")
  @js.native
  def list(
    pathToArchive: String,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Array[Result], Unit]
  ): Unit = js.native
  
  @JSImport("7zip-min", "pack")
  @js.native
  def pack(
    pathToDirOrFile: String,
    pathToArchive: String,
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("7zip-min", "unpack")
  @js.native
  def unpack(pathToArchive: String, whereToUnpack: String, errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  @js.native
  trait Result extends StObject {
    
    var attr: String = js.native
    
    var compressed: String = js.native
    
    var date: String = js.native
    
    var name: String = js.native
    
    var size: String = js.native
    
    var time: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(attr: String, compressed: String, date: String, name: String, size: String, time: String): Result = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressed(value: String): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
