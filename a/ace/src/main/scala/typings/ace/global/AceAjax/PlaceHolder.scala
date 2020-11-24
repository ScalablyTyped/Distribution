package typings.ace.global.AceAjax

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.ace.AceAjax.IEditSession
import typings.ace.AceAjax.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AceAjax.PlaceHolder")
@js.native
object PlaceHolder
  extends /**
  * - @param session (Document): The document to associate with the anchor
  * - @param length (Number): The starting row position
  * - @param pos (Number): The starting column position
  * - @param others (String):
  * - @param mainClass (String):
  * - @param othersClass (String):
  **/
Instantiable6[
      /* session */ typings.ace.AceAjax.Document, 
      /* length */ Double, 
      /* pos */ Double, 
      /* others */ String, 
      /* mainClass */ String, 
      /* othersClass */ String, 
      typings.ace.AceAjax.PlaceHolder
    ]
     with Instantiable4[
      /* session */ IEditSession, 
      /* length */ Double, 
      /* pos */ Position, 
      /* positions */ js.Array[Position], 
      typings.ace.AceAjax.PlaceHolder
    ]
