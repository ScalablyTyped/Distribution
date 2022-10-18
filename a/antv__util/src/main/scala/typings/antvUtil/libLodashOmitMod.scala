package typings.antvUtil

import typings.antvUtil.libLodashTypesMod.ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashOmitMod {
  
  @JSImport("@antv/util/lib/lodash/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](obj: ObjectType[T], keys: js.Array[String]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
}
