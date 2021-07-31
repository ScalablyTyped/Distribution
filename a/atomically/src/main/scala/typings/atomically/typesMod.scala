package typings.atomically

import typings.atomically.anon.Gid
import typings.atomically.atomicallyBooleans.`false`
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Callback = js.Function1[/* error */ Exception | Unit, js.Any]
  
  type Data = js.UndefOr[Buffer | String]
  
  type Disposer = js.Function0[Unit]
  
  type Exception = ErrnoException
  
  type FN[Arguments /* <: js.Array[js.Any] */, Return] = js.Function1[/* args */ Arguments, Return]
  
  type Path = String
  
  trait ReadOptions extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadOptions {
    
    @scala.inline
    def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait WriteOptions extends StObject {
    
    var chown: js.UndefOr[Gid | `false`] = js.undefined
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var fsync: js.UndefOr[Boolean] = js.undefined
    
    var fsyncWait: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var schedule: js.UndefOr[js.Function1[/* filePath */ String, js.Promise[Disposer]]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tmpCreate: js.UndefOr[js.Function1[/* filePath */ String, String]] = js.undefined
    
    var tmpCreated: js.UndefOr[js.Function1[/* filePath */ String, js.Any]] = js.undefined
    
    var tmpPurge: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    @scala.inline
    def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit class WriteOptionsMutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChown(value: Gid | `false`): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChownUndefined: Self = StObject.set(x, "chown", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      @scala.inline
      def setFsyncWait(value: Boolean): Self = StObject.set(x, "fsyncWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsyncWaitUndefined: Self = StObject.set(x, "fsyncWait", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setSchedule(value: /* filePath */ String => js.Promise[Disposer]): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTmpCreate(value: /* filePath */ String => String): Self = StObject.set(x, "tmpCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTmpCreateUndefined: Self = StObject.set(x, "tmpCreate", js.undefined)
      
      @scala.inline
      def setTmpCreated(value: /* filePath */ String => js.Any): Self = StObject.set(x, "tmpCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTmpCreatedUndefined: Self = StObject.set(x, "tmpCreated", js.undefined)
      
      @scala.inline
      def setTmpPurge(value: Boolean): Self = StObject.set(x, "tmpPurge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpPurgeUndefined: Self = StObject.set(x, "tmpPurge", js.undefined)
    }
  }
}
