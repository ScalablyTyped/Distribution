package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable2
import typings.three.mod.PropertyBinding
import typings.three.propertyBindingMod.ParseTrackNameResults
import typings.three.propertyBindingMod.PropertyBinding.Composite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPropertyBinding
  extends Instantiable2[/* rootNode */ js.Any, /* path */ String, PropertyBinding] {
  
  def create(root: js.Any, path: js.Any): typings.three.propertyBindingMod.PropertyBinding | Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.propertyBindingMod.PropertyBinding | Composite = js.native
  
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  
  def sanitizeNodeName(name: String): String = js.native
}
