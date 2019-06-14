package typings
package actionsDashOnDashGoogleLib.actionsDashOnDashGoogleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Responses")
@js.native
object ResponsesNs extends js.Object {
  @js.native
  /**
    * Constructor for BasicCard. Accepts optional BasicCard to clone.
    *
    * @param basicCard Optional BasicCard to clone.
    */
  class BasicCard ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.BasicCard {
    def this(basicCard: actionsDashOnDashGoogleLib.responseDashBuilderMod.BasicCard) = this()
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
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseCarousel {
    def this(carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseCarousel) = this()
    def this(carousel: js.Array[actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseItem]) = this()
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
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseItem {
    def this(title: java.lang.String) = this()
    def this(title: java.lang.String, url: java.lang.String) = this()
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
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel {
    def this(carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel) = this()
    def this(carousel: js.Array[actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem]) = this()
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
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.List {
    def this(list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List) = this()
    def this(list: java.lang.String) = this()
    def this(list: js.Array[actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem]) = this()
  }
  
  @js.native
  class MediaObject protected ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaObject {
    /**
      * Constructor for MediaObject.
      *
      * @param name Name of the MediaObject.
      * @param contentUrl URL of the MediaObject.
      */
    def this(name: java.lang.String, contentUrl: java.lang.String) = this()
  }
  
  @js.native
  class MediaResponse protected ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaResponse {
    /**
      * Constructor for MediaResponse.
      * @param mediaType Type of the media which defaults to MediaValues.Type.AUDIO
      */
    def this(mediaType: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type) = this()
  }
  
  @js.native
  /**
    * Constructor for OptionItem. Accepts optional OptionItem to clone.
    *
    * @param optionItem Optional OptionItem to clone.
    */
  class OptionItem ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem {
    def this(optionItem: actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem) = this()
  }
  
  @js.native
  /**
    * Constructor for RichResponse. Accepts optional RichResponse to clone.
    *
    * @param richResponse Optional RichResponse to clone.
    */
  class RichResponse ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse {
    def this(richResponse: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse) = this()
  }
  
  def isPaddedSsml(text: java.lang.String): scala.Boolean = js.native
  def isSsml(text: java.lang.String): scala.Boolean = js.native
  @js.native
  object ImageDisplays extends js.Object {
    /* 2 */ val CROPPED: actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays.CROPPED with scala.Double = js.native
    /* 0 */ val DEFAULT: actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays.DEFAULT with scala.Double = js.native
    /* 1 */ val WHITE: actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays.WHITE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays with scala.Double
      ] = js.native
  }
  
  @JSName("MediaValues")
  @js.native
  object MediaValuesNs extends js.Object {
    /**
      * List of possible item types.
      */
    @js.native
    object ImageType extends js.Object {
      /* 0 */ val ICON: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType.ICON with scala.Double = js.native
      /* 1 */ val LARGE: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType.LARGE with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType with scala.Double
          ] = js.native
    }
    
    /**
      * List of media control status' returned.
      */
    @js.native
    object Status extends js.Object {
      /* 1 */ val FINISHED: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status.FINISHED with scala.Double = js.native
      /* 0 */ val UNSPECIFIED: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status.UNSPECIFIED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status with scala.Double
          ] = js.native
    }
    
    /**
      * Type of the media within a MediaResponse.
      */
    @js.native
    object Type extends js.Object {
      /* 1 */ val AUDIO: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type.AUDIO with scala.Double = js.native
      /* 0 */ val MEDIA_TYPE_UNSPECIFIED: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type.MEDIA_TYPE_UNSPECIFIED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type with scala.Double
          ] = js.native
    }
    
  }
  
}

