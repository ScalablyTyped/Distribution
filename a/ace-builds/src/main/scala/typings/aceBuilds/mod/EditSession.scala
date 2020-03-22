package typings.aceBuilds.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.aceBuilds.mod.Ace.SyntaxMode
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-builds", "EditSession")
@js.native
class EditSession protected ()
  extends typings.aceBuilds.mod.Ace.EditSession {
  def this(text: String) = this()
  def this(text: Document_) = this()
  def this(text: String, mode: SyntaxMode) = this()
  def this(text: Document_, mode: SyntaxMode) = this()
}

@JSImport("ace-builds", "EditSession")
@js.native
object EditSession
  extends Instantiable1[
      (/* text */ Document_) | (/* text */ String), 
      typings.aceBuilds.mod.Ace.EditSession
    ]
     with Instantiable2[
      (/* text */ Document_) | (/* text */ String), 
      /* mode */ SyntaxMode, 
      typings.aceBuilds.mod.Ace.EditSession
    ]

