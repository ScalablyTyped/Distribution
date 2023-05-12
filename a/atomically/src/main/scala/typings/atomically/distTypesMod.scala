package typings.atomically

import typings.atomically.anon.Gid
import typings.atomically.atomicallyBooleans.`false`
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Callback = js.Function1[/* error */ Exception | Unit, Unit]
  
  type Data = js.UndefOr[js.typedarray.Uint8Array | String]
  
  type Disposer = js.Function0[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.atomically.atomicallyStrings.ascii
    - typings.atomically.atomicallyStrings.base64
    - typings.atomically.atomicallyStrings.binary
    - typings.atomically.atomicallyStrings.hex
    - typings.atomically.atomicallyStrings.latin1
    - typings.atomically.atomicallyStrings.utf8
    - typings.atomically.atomicallyStrings.`utf-8`
    - typings.atomically.atomicallyStrings.utf16le
    - typings.atomically.atomicallyStrings.ucs2
    - typings.atomically.atomicallyStrings.`ucs-2`
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ascii: typings.atomically.atomicallyStrings.ascii = "ascii".asInstanceOf[typings.atomically.atomicallyStrings.ascii]
    
    inline def base64: typings.atomically.atomicallyStrings.base64 = "base64".asInstanceOf[typings.atomically.atomicallyStrings.base64]
    
    inline def binary: typings.atomically.atomicallyStrings.binary = "binary".asInstanceOf[typings.atomically.atomicallyStrings.binary]
    
    inline def hex: typings.atomically.atomicallyStrings.hex = "hex".asInstanceOf[typings.atomically.atomicallyStrings.hex]
    
    inline def latin1: typings.atomically.atomicallyStrings.latin1 = "latin1".asInstanceOf[typings.atomically.atomicallyStrings.latin1]
    
    inline def `ucs-2`: typings.atomically.atomicallyStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.atomically.atomicallyStrings.`ucs-2`]
    
    inline def ucs2: typings.atomically.atomicallyStrings.ucs2 = "ucs2".asInstanceOf[typings.atomically.atomicallyStrings.ucs2]
    
    inline def `utf-8`: typings.atomically.atomicallyStrings.`utf-8` = "utf-8".asInstanceOf[typings.atomically.atomicallyStrings.`utf-8`]
    
    inline def utf16le: typings.atomically.atomicallyStrings.utf16le = "utf16le".asInstanceOf[typings.atomically.atomicallyStrings.utf16le]
    
    inline def utf8: typings.atomically.atomicallyStrings.utf8 = "utf8".asInstanceOf[typings.atomically.atomicallyStrings.utf8]
  }
  
  type Exception = ErrnoException
  
  type Path = String
  
  trait ReadOptions extends StObject {
    
    var encoding: js.UndefOr[Encoding | Null] = js.undefined
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
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
    
    var encoding: js.UndefOr[Encoding | Null] = js.undefined
    
    var fsync: js.UndefOr[Boolean] = js.undefined
    
    var fsyncWait: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var schedule: js.UndefOr[js.Function1[/* filePath */ String, js.Promise[Disposer]]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tmpCreate: js.UndefOr[js.Function1[/* filePath */ String, String]] = js.undefined
    
    var tmpCreated: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.undefined
    
    var tmpPurge: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      inline def setChown(value: Gid | `false`): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      inline def setChownUndefined: Self = StObject.set(x, "chown", js.undefined)
      
      inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
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
      
      inline def setTmpCreated(value: /* filePath */ String => Unit): Self = StObject.set(x, "tmpCreated", js.Any.fromFunction1(value))
      
      inline def setTmpCreatedUndefined: Self = StObject.set(x, "tmpCreated", js.undefined)
      
      inline def setTmpPurge(value: Boolean): Self = StObject.set(x, "tmpPurge", value.asInstanceOf[js.Any])
      
      inline def setTmpPurgeUndefined: Self = StObject.set(x, "tmpPurge", js.undefined)
    }
  }
}
