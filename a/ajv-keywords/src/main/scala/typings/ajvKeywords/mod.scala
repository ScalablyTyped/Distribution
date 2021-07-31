package typings.ajvKeywords

import typings.ajv.mod.Ajv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(ajv: Ajv): Ajv = ^.asInstanceOf[js.Dynamic].apply(ajv.asInstanceOf[js.Any]).asInstanceOf[Ajv]
  @scala.inline
  def apply(ajv: Ajv, include: String): Ajv = (^.asInstanceOf[js.Dynamic].apply(ajv.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Ajv]
  @scala.inline
  def apply(ajv: Ajv, include: js.Array[String]): Ajv = (^.asInstanceOf[js.Dynamic].apply(ajv.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Ajv]
  
  @JSImport("ajv-keywords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
