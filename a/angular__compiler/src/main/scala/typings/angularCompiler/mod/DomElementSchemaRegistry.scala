package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "DomElementSchemaRegistry")
@js.native
open class DomElementSchemaRegistry () extends ElementSchemaRegistry {
  
  /* private */ var _eventSchema: Any = js.native
  
  /* private */ var _schema: Any = js.native
  
  def allKnownAttributesOfElement(tagName: String): js.Array[String] = js.native
  
  def allKnownEventsOfElement(tagName: String): js.Array[String] = js.native
}
