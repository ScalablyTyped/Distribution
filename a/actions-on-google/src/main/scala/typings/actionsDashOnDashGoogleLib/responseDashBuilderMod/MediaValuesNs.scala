package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "MediaValues")
@js.native
object MediaValuesNs extends js.Object {
  @js.native
  sealed trait ImageType extends js.Object
  
  @js.native
  sealed trait Status extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  /**
       * List of possible item types.
       */
  @js.native
  object ImageType extends js.Object {
    /**
             * Icon.
             */
    @js.native
    sealed trait ICON
      extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType
    
    /**
             * Large image.
             */
    @js.native
    sealed trait LARGE
      extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType
    
    val ICON: ICON with java.lang.String = js.native
    val LARGE: LARGE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType with java.lang.String
      ] = js.native
  }
  
  /**
       * List of media control status' returned.
       */
  @js.native
  object Status extends js.Object {
    /**
             * Finished.
             */
    @js.native
    sealed trait FINISHED
      extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status
    
    /**
             * Unspecified.
             */
    @js.native
    sealed trait UNSPECIFIED
      extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status
    
    val FINISHED: FINISHED with java.lang.String = js.native
    val UNSPECIFIED: UNSPECIFIED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status with java.lang.String
      ] = js.native
  }
  
  /**
       * Type of the media within a MediaResponse.
       */
  @js.native
  object Type extends js.Object {
    /**
             * Audio stream.
             */
    @js.native
    sealed trait AUDIO
      extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type
    
    /**
             * Unspecified.
             */
    @js.native
    sealed trait MEDIA_TYPE_UNSPECIFIED
      extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type
    
    val AUDIO: AUDIO with java.lang.String = js.native
    val MEDIA_TYPE_UNSPECIFIED: MEDIA_TYPE_UNSPECIFIED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type with java.lang.String
      ] = js.native
  }
  
}

