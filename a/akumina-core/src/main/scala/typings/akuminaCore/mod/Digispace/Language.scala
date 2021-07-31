package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.Language")
@js.native
class Language () extends StObject
object Language {
  
  @JSImport("akumina-core", "Digispace.Language")
  @js.native
  val ^ : js.Any = js.native
  
  /* Added */
  /* static member */
  @scala.inline
  def GetText(Token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetText")(Token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def TryGetText(Token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("TryGetText")(Token.asInstanceOf[js.Any]).asInstanceOf[String]
}
