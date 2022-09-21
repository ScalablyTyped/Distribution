package typings.atlaskitTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sameProps(oldProps: Any, newProps: Any, props: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameProps")(oldProps.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
