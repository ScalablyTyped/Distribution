package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/metadata/resource_loading", JSImport.Namespace)
@js.native
object srcMetadataResourceUnderscoreLoadingMod extends js.Object {
  def clearResolutionOfComponentResourcesQueue(): scala.Unit = js.native
  def componentNeedsResolution(component: atAngularCoreLib.srcMetadataDirectivesMod.Component): js.UndefOr[java.lang.String | scala.Double] = js.native
  def maybeQueueResolutionOfComponentResources(metadata: atAngularCoreLib.srcMetadataDirectivesMod.Component): scala.Unit = js.native
  def resolveComponentResources(
    resourceResolver: js.Function1[
      /* url */ java.lang.String, 
      js.Promise[java.lang.String | atAngularCoreLib.Anon_Text]
    ]
  ): js.Promise[scala.Null] = js.native
}

