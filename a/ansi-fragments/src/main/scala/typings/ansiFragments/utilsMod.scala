package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ansi-fragments/build/fragments/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildChildren(children: js.Array[String | IFragment]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildChildren")(children.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
