package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.ImageType
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Status
import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "MediaValues")
@js.native
object MediaValues extends js.Object {
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
    sealed trait ICON extends ImageType
    
    /**
      * Large image.
      */
    @js.native
    sealed trait LARGE extends ImageType
    
    /* 0 */ val ICON: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.ImageType.ICON with Double = js.native
    /* 1 */ val LARGE: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.ImageType.LARGE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageType with Double] = js.native
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
    sealed trait FINISHED extends Status
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED extends Status
    
    /* 1 */ val FINISHED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Status.FINISHED with Double = js.native
    /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Status.UNSPECIFIED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
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
    sealed trait AUDIO extends Type
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait MEDIA_TYPE_UNSPECIFIED extends Type
    
    /* 1 */ val AUDIO: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type.AUDIO with Double = js.native
    /* 0 */ val MEDIA_TYPE_UNSPECIFIED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type.MEDIA_TYPE_UNSPECIFIED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type with Double] = js.native
  }
  
}

