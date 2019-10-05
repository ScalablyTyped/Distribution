package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod

import typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Responses")
@js.native
object Responses extends js.Object {
  @js.native
  /**
    * Constructor for BasicCard. Accepts optional BasicCard to clone.
    *
    * @param basicCard Optional BasicCard to clone.
    */
  class BasicCard ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.BasicCard {
    def this(basicCard: typings.actionsDashOnDashGoogle.responseDashBuilderMod.BasicCard) = this()
  }
  
  @js.native
  /**
    * Constructor for BrowseCarousel. Accepts optional BrowseCarousel to
    * clone or list of items to copy.
    *
    * @param carousel Either a carousel to clone
    *     or an array of BrowseItem to initialize a new carousel
    */
  class BrowseCarousel ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.BrowseCarousel {
    def this(carousel: js.Array[typings.actionsDashOnDashGoogle.responseDashBuilderMod.BrowseItem]) = this()
    def this(carousel: typings.actionsDashOnDashGoogle.responseDashBuilderMod.BrowseCarousel) = this()
  }
  
  @js.native
  /**
    * Constructor for BrowseItem. Accepts a title and URL for the Browse Item
    * card.
    *
    * @param title The title of the Browse Item card.
    * @param url The URL of the link opened by clicking the  Browse Item card.
    */
  class BrowseItem ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.BrowseItem {
    def this(title: String) = this()
    def this(title: String, url: String) = this()
  }
  
  @js.native
  /**
    * Constructor for Carousel. Accepts optional Carousel to clone or list of
    * items to copy.
    *
    * @param carousel Either a carousel to clone
    *     or an array of OptionItem to initialize a new carousel
    */
  class Carousel ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.Carousel {
    def this(carousel: js.Array[typings.actionsDashOnDashGoogle.responseDashBuilderMod.OptionItem]) = this()
    def this(carousel: typings.actionsDashOnDashGoogle.responseDashBuilderMod.Carousel) = this()
  }
  
  @js.native
  /**
    * Constructor for List. Accepts optional List to clone, string title, or
    * list of items to copy.
    *
    * @param list Either a list to clone, a title
    *     to set for a new List, or an array of OptionItem to initialize a new
    *     list.
    */
  class List ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.List {
    def this(list: String) = this()
    def this(list: js.Array[typings.actionsDashOnDashGoogle.responseDashBuilderMod.OptionItem]) = this()
    def this(list: typings.actionsDashOnDashGoogle.responseDashBuilderMod.List) = this()
  }
  
  @js.native
  class MediaObject protected ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaObject {
    /**
      * Constructor for MediaObject.
      *
      * @param name Name of the MediaObject.
      * @param contentUrl URL of the MediaObject.
      */
    def this(name: String, contentUrl: String) = this()
  }
  
  @js.native
  class MediaResponse protected ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaResponse {
    /**
      * Constructor for MediaResponse.
      * @param mediaType Type of the media which defaults to MediaValues.Type.AUDIO
      */
    def this(mediaType: Type) = this()
  }
  
  @js.native
  /**
    * Constructor for OptionItem. Accepts optional OptionItem to clone.
    *
    * @param optionItem Optional OptionItem to clone.
    */
  class OptionItem ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.OptionItem {
    def this(optionItem: typings.actionsDashOnDashGoogle.responseDashBuilderMod.OptionItem) = this()
  }
  
  @js.native
  /**
    * Constructor for RichResponse. Accepts optional RichResponse to clone.
    *
    * @param richResponse Optional RichResponse to clone.
    */
  class RichResponse ()
    extends typings.actionsDashOnDashGoogle.responseDashBuilderMod.RichResponse {
    def this(richResponse: typings.actionsDashOnDashGoogle.responseDashBuilderMod.RichResponse) = this()
  }
  
  def isPaddedSsml(text: String): Boolean = js.native
  def isSsml(text: String): Boolean = js.native
  @js.native
  object ImageDisplays extends js.Object {
    /* 2 */ val CROPPED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.ImageDisplays.CROPPED with Double = js.native
    /* 0 */ val DEFAULT: typings.actionsDashOnDashGoogle.responseDashBuilderMod.ImageDisplays.DEFAULT with Double = js.native
    /* 1 */ val WHITE: typings.actionsDashOnDashGoogle.responseDashBuilderMod.ImageDisplays.WHITE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.actionsDashOnDashGoogle.responseDashBuilderMod.ImageDisplays with Double] = js.native
  }
  
  @js.native
  object MediaValues extends js.Object {
    /**
      * List of possible item types.
      */
    @js.native
    object ImageType extends js.Object {
      /* 0 */ val ICON: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.ImageType.ICON with Double = js.native
      /* 1 */ val LARGE: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.ImageType.LARGE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.ImageType with Double
          ] = js.native
    }
    
    /**
      * List of media control status' returned.
      */
    @js.native
    object Status extends js.Object {
      /* 1 */ val FINISHED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Status.FINISHED with Double = js.native
      /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Status.UNSPECIFIED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Status with Double
          ] = js.native
    }
    
    /**
      * Type of the media within a MediaResponse.
      */
    @js.native
    object Type extends js.Object {
      /* 1 */ val AUDIO: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type.AUDIO with Double = js.native
      /* 0 */ val MEDIA_TYPE_UNSPECIFIED: typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type.MEDIA_TYPE_UNSPECIFIED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.responseDashBuilderMod.MediaValues.Type with Double
          ] = js.native
    }
    
  }
  
}

