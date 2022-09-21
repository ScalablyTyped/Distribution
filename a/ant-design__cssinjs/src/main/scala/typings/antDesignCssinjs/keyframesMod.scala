package typings.antDesignCssinjs

import typings.antDesignCssinjs.useStyleRegisterMod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyframesMod {
  
  @JSImport("@ant-design/cssinjs/es/Keyframes", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Keyframe {
    def this(name: String, style: CSSInterpolation) = this()
  }
  
  @js.native
  trait Keyframe extends StObject {
    
    var _keyframe: Boolean = js.native
    
    def getName(): String = js.native
    def getName(hashId: String): String = js.native
    
    /* private */ var name: Any = js.native
    
    var style: CSSInterpolation = js.native
  }
}
