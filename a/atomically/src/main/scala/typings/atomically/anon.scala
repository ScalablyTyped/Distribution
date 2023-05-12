package typings.atomically

import typings.atomically.atomicallyBooleans.`false`
import typings.atomically.distTypesMod.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Gid extends StObject {
    
    var gid: Double
    
    var uid: Double
  }
  object Gid {
    
    inline def apply(gid: Double, uid: Double): Gid = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Gid] (val x: Self) extends AnyVal {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined atomically.atomically/dist/types.ReadOptions & {  encoding :string} */
  trait ReadOptionsencodingstring extends StObject {
    
    var encoding: js.UndefOr[Encoding | Null] = js.undefined
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadOptionsencodingstring {
    
    inline def apply(): ReadOptionsencodingstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptionsencodingstring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOptionsencodingstring] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
