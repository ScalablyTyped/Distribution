package typings.atlassianCrowdClient.attributesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianCrowdClient.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atlassian-crowd-client/lib/models/attributes", JSImport.Namespace)
@js.native
class ^ protected () extends Attributes {
  def this(attributePairs: StringDictionary[js.Any]) = this()
}
@JSImport("atlassian-crowd-client/lib/models/attributes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def fromCrowd(attributesArr: js.Array[Name]): Attributes = js.native
  def fromCrowd(attributesArr: js.Array[Name], parse: js.Function1[/* json */ String, _]): Attributes = js.native
}
