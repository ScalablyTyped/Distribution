package typings.atomically

import typings.atomically.anon.Gid
import typings.atomically.atomicallyBooleans.`false`
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Callback = js.Function1[/* error */ Exception | Unit, Any]
  
  type Data = js.UndefOr[Buffer | String]
  
  type Disposer = js.Function0[Unit]
  
  type Exception = ErrnoException
  
  type FN[Arguments /* <: js.Array[Any] */, Return] = js.Function1[/* args */ Arguments, Return]
  
  type Path = String
  
  trait ReadOptions extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
    
    var tmpCreated: js.UndefOr[js.Function1[/* filePath */ String, Any]] = js.undefined
    
    var tmpPurge: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setChown(value: Gid | `false`): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      inline def setChownUndefined: Self = StObject.set(x, "chown", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      inline def setFsyncWait(value: Boolean): Self = StObject.set(x, "fsyncWait", value.asInstanceOf[js.Any])
      
      inline def setFsyncWaitUndefined: Self = StObject.set(x, "fsyncWait", js.undefined)
      
      inline def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSchedule(value: /* filePath */ String => js.Promise[Disposer]): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
      
      inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTmpCreate(value: /* filePath */ String => String): Self = StObject.set(x, "tmpCreate", js.Any.fromFunction1(value))
      
      inline def setTmpCreateUndefined: Self = StObject.set(x, "tmpCreate", js.undefined)
      
      inline def setTmpCreated(value: /* filePath */ String => Any): Self = StObject.set(x, "tmpCreated", js.Any.fromFunction1(value))
      
      inline def setTmpCreatedUndefined: Self = StObject.set(x, "tmpCreated", js.undefined)
      
      inline def setTmpPurge(value: Boolean): Self = StObject.set(x, "tmpPurge", value.asInstanceOf[js.Any])
      
      inline def setTmpPurgeUndefined: Self = StObject.set(x, "tmpPurge", js.undefined)
    }
  }
}
