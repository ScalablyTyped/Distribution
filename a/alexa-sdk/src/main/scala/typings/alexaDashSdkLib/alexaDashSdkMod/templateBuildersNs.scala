package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "templateBuilders")
@js.native
object templateBuildersNs extends js.Object {
  /**
       * Used to create BodyTemplate1 objects
       */
  @js.native
  class BodyTemplate1Builder ()
    extends TemplateBuilder[BodyTemplate1Builder]
       with SetTextContent[BodyTemplate1Builder]
  
  /**
       * Used to create BodyTemplate2 objects
       */
  @js.native
  class BodyTemplate2Builder ()
    extends TemplateBuilder[BodyTemplate2Builder]
       with SetTextContent[BodyTemplate2Builder] {
    /**
             * Sets the image for the template
             * @param image image
             * @returns BodyTemplate2Builder
             */
    def setImage(image: alexaDashSdkLib.alexaDashSdkMod.Image): BodyTemplate2Builder = js.native
  }
  
  /**
       * Used to create BodyTemplate3 objects
       */
  @js.native
  class BodyTemplate3Builder ()
    extends TemplateBuilder[BodyTemplate3Builder]
       with SetTextContent[BodyTemplate3Builder] {
    /**
             * Sets the image for the template
             * @param image image
             * @returns BodyTemplate3Builder
             */
    def setImage(image: alexaDashSdkLib.alexaDashSdkMod.Image): BodyTemplate3Builder = js.native
  }
  
  /**
       * Used to create BodyTemplate6 objects
       */
  @js.native
  class BodyTemplate6Builder ()
    extends TemplateBuilder[BodyTemplate6Builder]
       with SetTextContent[BodyTemplate6Builder] {
    /**
             * Sets the image for the template
             * @param image image
             * @returns BodyTemplate6Builder
             */
    def setImage(image: alexaDashSdkLib.alexaDashSdkMod.Image): BodyTemplate6Builder = js.native
  }
  
  /**
       * Used to create BodyTemplate7 objects
       */
  @js.native
  class BodyTemplate7Builder () extends TemplateBuilder[BodyTemplate7Builder] {
    /**
             * Sets the image for the template
             * @param image image
             * @returns BodyTemplate7Builder
             */
    def setImage(image: alexaDashSdkLib.alexaDashSdkMod.Image): BodyTemplate7Builder = js.native
  }
  
  /**
       * Used to build a list of ListItems for ListTemplate
       */
  @js.native
  class ListItemBuilder () extends js.Object {
    var items: js.Array[alexaDashSdkLib.alexaDashSdkMod.ListItem] = js.native
    /**
             * Add an item to the list of template
             * @param image image
             * @param token token
             * @param primaryText primaryText
             * @param secondaryText secondaryText
             * @param tertiaryText tertiaryText
             */
    def addItem(
      image: alexaDashSdkLib.alexaDashSdkMod.Image,
      token: java.lang.String,
      primaryText: alexaDashSdkLib.alexaDashSdkMod.TextField
    ): ListItemBuilder = js.native
    /**
             * Add an item to the list of template
             * @param image image
             * @param token token
             * @param primaryText primaryText
             * @param secondaryText secondaryText
             * @param tertiaryText tertiaryText
             */
    def addItem(
      image: alexaDashSdkLib.alexaDashSdkMod.Image,
      token: java.lang.String,
      primaryText: alexaDashSdkLib.alexaDashSdkMod.TextField,
      secondaryText: alexaDashSdkLib.alexaDashSdkMod.TextField
    ): ListItemBuilder = js.native
    /**
             * Add an item to the list of template
             * @param image image
             * @param token token
             * @param primaryText primaryText
             * @param secondaryText secondaryText
             * @param tertiaryText tertiaryText
             */
    def addItem(
      image: alexaDashSdkLib.alexaDashSdkMod.Image,
      token: java.lang.String,
      primaryText: alexaDashSdkLib.alexaDashSdkMod.TextField,
      secondaryText: alexaDashSdkLib.alexaDashSdkMod.TextField,
      tertiaryText: alexaDashSdkLib.alexaDashSdkMod.TextField
    ): ListItemBuilder = js.native
    def build(): js.Array[alexaDashSdkLib.alexaDashSdkMod.ListItem] = js.native
  }
  
  /**
       * Used to create ListTemplate1 objects
       */
  @js.native
  class ListTemplate1Builder ()
    extends TemplateBuilder[ListTemplate1Builder]
       with SetListItems[ListTemplate1Builder] {
    /* CompleteClass */
    override def setListItems(listItems: js.Array[alexaDashSdkLib.alexaDashSdkMod.ListItem]): ListTemplate1Builder = js.native
  }
  
  /**
       * Used to create ListTemplate2 objects
       */
  @js.native
  class ListTemplate2Builder ()
    extends TemplateBuilder[ListTemplate2Builder]
       with SetListItems[ListTemplate2Builder] {
    /* CompleteClass */
    override def setListItems(listItems: js.Array[alexaDashSdkLib.alexaDashSdkMod.ListItem]): ListTemplate2Builder = js.native
  }
  
  
  trait SetListItems[T /* <: TemplateBuilder[T] */] extends js.Object {
    def setListItems(listItems: js.Array[alexaDashSdkLib.alexaDashSdkMod.ListItem]): T
  }
  
  @js.native
  trait SetTextContent[T /* <: TemplateBuilder[T] */] extends js.Object {
    def setTextContent(primaryText: alexaDashSdkLib.alexaDashSdkMod.TextField): T = js.native
    def setTextContent(
      primaryText: alexaDashSdkLib.alexaDashSdkMod.TextField,
      secondaryText: alexaDashSdkLib.alexaDashSdkMod.TextField
    ): T = js.native
    def setTextContent(
      primaryText: alexaDashSdkLib.alexaDashSdkMod.TextField,
      secondaryText: alexaDashSdkLib.alexaDashSdkMod.TextField,
      tertiaryText: alexaDashSdkLib.alexaDashSdkMod.TextField
    ): T = js.native
  }
  
  /**
       * Refer https://developer.amazon.com/docs/custom-skills/display-interface-reference.html#image-sizes
       */
  @js.native
  abstract class TemplateBuilder[T /* <: TemplateBuilder[T] */] () extends js.Object {
    var template: alexaDashSdkLib.alexaDashSdkMod.Template = js.native
    /**
             * Builds the template JSON object
             * @returns Template
             */
    def build(): alexaDashSdkLib.alexaDashSdkMod.Template = js.native
    /**
             * Sets the backButton behavior
             * @param backButtonBehavior "VISIBLE" or "HIDDEN"
             * @returns TemplateBuilder
             */
    def setBackButtonBehavior(backButtonBehavior: java.lang.String): T = js.native
    /**
             * Sets the background image of the template
             * @param image image
             * @returns TemplateBuilder
             */
    def setBackgroundImage(image: alexaDashSdkLib.alexaDashSdkMod.Image): T = js.native
    /**
             * Sets the title of the template
             * @param title title
             * @returns TemplateBuilder
             */
    def setTitle(title: java.lang.String): T = js.native
    /**
             * Sets the token of the template
             * @param token token
             * @returns TemplateBuilder
             */
    def setToken(token: java.lang.String): T = js.native
  }
  
}

