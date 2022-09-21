package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scripts extends StObject {
  
  def apply(Index: Any): Script = js.native
  
  /**
    * @param Location [Location=2]
    * @param Language [Language=2]
    * @param Id [Id='']
    * @param Extended [Extended='']
    * @param ScriptText [ScriptText='']
    */
  def Add(
    Anchor: js.UndefOr[Any],
    Location: js.UndefOr[MsoScriptLocation],
    Language: js.UndefOr[MsoScriptLanguage],
    Id: js.UndefOr[String],
    Extended: js.UndefOr[String],
    ScriptText: js.UndefOr[String]
  ): Script = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: Any): Script = js.native
  
  val Parent: Any = js.native
}
