package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("ansi-fragments/build/fragments/Container", "Container")
  @js.native
  class Container_ protected () extends IFragment {
    def this(children: js.Array[String | IFragment]) = this()
    
    val children: js.Any = js.native
  }
  
  @JSImport("ansi-fragments/build/fragments/Container", "container")
  @js.native
  def container(children: (String | IFragment)*): Container_ = js.native
}
