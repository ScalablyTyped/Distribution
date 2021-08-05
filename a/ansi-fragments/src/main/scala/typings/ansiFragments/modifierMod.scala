package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifierMod {
  
  @JSImport("ansi-fragments/build/fragments/Modifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Modifier", "Modifier")
  @js.native
  class Modifier_ protected ()
    extends StObject
       with IFragment {
    def this(ansiModifier: AnsiModifier, children: js.Array[String | IFragment]) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val children: js.Any = js.native
    
    /* private */ val modifier: js.Any = js.native
  }
  
  inline def modifier(ansiModifier: AnsiModifier, children: (String | IFragment)*): Modifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("modifier")(ansiModifier.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Modifier_]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiFragments.ansiFragmentsStrings.dim
    - typings.ansiFragments.ansiFragmentsStrings.bold
    - typings.ansiFragments.ansiFragmentsStrings.hidden
    - typings.ansiFragments.ansiFragmentsStrings.italic
    - typings.ansiFragments.ansiFragmentsStrings.underline
    - typings.ansiFragments.ansiFragmentsStrings.strikethrough
    - typings.ansiFragments.ansiFragmentsStrings.none
  */
  trait AnsiModifier extends StObject
  object AnsiModifier {
    
    inline def bold: typings.ansiFragments.ansiFragmentsStrings.bold = "bold".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bold]
    
    inline def dim: typings.ansiFragments.ansiFragmentsStrings.dim = "dim".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.dim]
    
    inline def hidden: typings.ansiFragments.ansiFragmentsStrings.hidden = "hidden".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.hidden]
    
    inline def italic: typings.ansiFragments.ansiFragmentsStrings.italic = "italic".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.italic]
    
    inline def none: typings.ansiFragments.ansiFragmentsStrings.none = "none".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.none]
    
    inline def strikethrough: typings.ansiFragments.ansiFragmentsStrings.strikethrough = "strikethrough".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.strikethrough]
    
    inline def underline: typings.ansiFragments.ansiFragmentsStrings.underline = "underline".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.underline]
  }
}
