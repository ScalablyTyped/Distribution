package typings.atlassianCrowdClient.attributesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianCrowdClient.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/attributes", JSImport.Namespace)
@js.native
class ^ protected () extends Attributes {
  def this(attributePairs: StringDictionary[js.Any]) = this()
}

@JSImport("atlassian-crowd-client/lib/models/attributes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(attributesArr: js.Array[AnonName]): Attributes = js.native
  def fromCrowd(attributesArr: js.Array[AnonName], parse: js.Function1[/* json */ String, _]): Attributes = js.native
}

