package typings.attrAccept

import typings.attrAccept.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("attr-accept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(file: Name, acceptedFiles: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(file: Name, acceptedFiles: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
