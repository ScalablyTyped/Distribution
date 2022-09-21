package typings.ace

import typings.ace.AceAjax.NewLineMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aceStrings {
  
  @js.native
  sealed trait afterExec extends StObject
  inline def afterExec: afterExec = "afterExec".asInstanceOf[afterExec]
  
  @js.native
  sealed trait auto
    extends StObject
       with NewLineMode
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait exec extends StObject
  inline def exec: exec = "exec".asInstanceOf[exec]
  
  @js.native
  sealed trait insert extends StObject
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait unix
    extends StObject
       with NewLineMode
  inline def unix: unix = "unix".asInstanceOf[unix]
  
  @js.native
  sealed trait windows
    extends StObject
       with NewLineMode
  inline def windows: windows = "windows".asInstanceOf[windows]
}
