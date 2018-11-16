package typings
package actionsDashOnDashGoogleLib.actionsDashOnDashGoogleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Responses")
@js.native
object ResponsesNs extends js.Object {
  @js.native
  class BasicCard ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.BasicCard {
    /**
         * Constructor for BasicCard. Accepts optional BasicCard to clone.
         *
         * @param basicCard Optional BasicCard to clone.
         */
    def this(basicCard: actionsDashOnDashGoogleLib.responseDashBuilderMod.BasicCard) = this()
  }
  
  @js.native
  class BrowseCarousel ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseCarousel {
    /**
         * Constructor for BrowseCarousel. Accepts optional BrowseCarousel to
         * clone or list of items to copy.
         *
         * @param carousel Either a carousel to clone
         *     or an array of BrowseItem to initialize a new carousel
         */
    def this(carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseCarousel) = this()
    /**
         * Constructor for BrowseCarousel. Accepts optional BrowseCarousel to
         * clone or list of items to copy.
         *
         * @param carousel Either a carousel to clone
         *     or an array of BrowseItem to initialize a new carousel
         */
    def this(carousel: js.Array[actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseItem]) = this()
  }
  
  @js.native
  class BrowseItem ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.BrowseItem {
    /**
         * Constructor for BrowseItem. Accepts a title and URL for the Browse Item
         * card.
         *
         * @param title The title of the Browse Item card.
         * @param url The URL of the link opened by clicking the  Browse Item card.
         */
    def this(title: java.lang.String) = this()
    /**
         * Constructor for BrowseItem. Accepts a title and URL for the Browse Item
         * card.
         *
         * @param title The title of the Browse Item card.
         * @param url The URL of the link opened by clicking the  Browse Item card.
         */
    def this(title: java.lang.String, url: java.lang.String) = this()
  }
  
  @js.native
  class Carousel ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel {
    /**
         * Constructor for Carousel. Accepts optional Carousel to clone or list of
         * items to copy.
         *
         * @param carousel Either a carousel to clone
         *     or an array of OptionItem to initialize a new carousel
         */
    def this(carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel) = this()
    /**
         * Constructor for Carousel. Accepts optional Carousel to clone or list of
         * items to copy.
         *
         * @param carousel Either a carousel to clone
         *     or an array of OptionItem to initialize a new carousel
         */
    def this(carousel: js.Array[actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem]) = this()
  }
  
  @js.native
  class List ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.List {
    /**
         * Constructor for List. Accepts optional List to clone, string title, or
         * list of items to copy.
         *
         * @param list Either a list to clone, a title
         *     to set for a new List, or an array of OptionItem to initialize a new
         *     list.
         */
    def this(list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List) = this()
    /**
         * Constructor for List. Accepts optional List to clone, string title, or
         * list of items to copy.
         *
         * @param list Either a list to clone, a title
         *     to set for a new List, or an array of OptionItem to initialize a new
         *     list.
         */
    def this(list: java.lang.String) = this()
    /**
         * Constructor for List. Accepts optional List to clone, string title, or
         * list of items to copy.
         *
         * @param list Either a list to clone, a title
         *     to set for a new List, or an array of OptionItem to initialize a new
         *     list.
         */
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
  class OptionItem ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem {
    /**
         * Constructor for OptionItem. Accepts optional OptionItem to clone.
         *
         * @param optionItem Optional OptionItem to clone.
         */
    def this(optionItem: actionsDashOnDashGoogleLib.responseDashBuilderMod.OptionItem) = this()
  }
  
  @js.native
  class RichResponse ()
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse {
    /**
         * Constructor for RichResponse. Accepts optional RichResponse to clone.
         *
         * @param richResponse Optional RichResponse to clone.
         */
    def this(richResponse: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse) = this()
  }
  
  def isPaddedSsml(text: java.lang.String): scala.Boolean = js.native
  def isSsml(text: java.lang.String): scala.Boolean = js.native
  @js.native
  object ImageDisplays extends js.Object {
    val CROPPED: actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays.CROPPED with java.lang.String = js.native
    val DEFAULT: actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays.DEFAULT with java.lang.String = js.native
    val WHITE: actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays.WHITE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays with java.lang.String
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
      val ICON: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType.ICON with java.lang.String = js.native
      val LARGE: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType.LARGE with java.lang.String = js.native
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
      val FINISHED: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status.FINISHED with java.lang.String = js.native
      val UNSPECIFIED: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status.UNSPECIFIED with java.lang.String = js.native
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
      val AUDIO: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type.AUDIO with java.lang.String = js.native
      val MEDIA_TYPE_UNSPECIFIED: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type.MEDIA_TYPE_UNSPECIFIED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type with java.lang.String
          ] = js.native
    }
    
    type ImageType = actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType
    type Status = actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Status
    type Type = actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.Type
  }
  
  type ImageDisplays = actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays
}

