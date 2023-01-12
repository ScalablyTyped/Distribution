package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  @JSImport("amcharts/Slice", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Slice {
    
    /**
      * Opacity of a slice.
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * Color of a slice.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Original object from data provider.
      */
    /* CompleteClass */
    var dataContext: js.Object = js.native
    
    /**
      * Slice description.
      */
    /* CompleteClass */
    var description: String = js.native
    
    /**
      * Specifies whether the slice is hidden
      */
    /* CompleteClass */
    var hidden: Boolean = js.native
    
    /**
      * Percent value of a slice.
      */
    /* CompleteClass */
    var percents: Double = js.native
    
    /**
      * Specifies whether the slice is pulled or not.
      */
    /* CompleteClass */
    var pulled: Boolean = js.native
    
    /**
      * Slice title
      */
    /* CompleteClass */
    var title: String = js.native
    
    /**
      * Url of a slice
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * Value of a slice
      */
    /* CompleteClass */
    var value: Double = js.native
    
    /**
      * specifies whether this slice has a legend entry
      */
    /* CompleteClass */
    var visibleInLegend: Boolean = js.native
  }
  
  trait Slice extends StObject {
    
    /**
      * Opacity of a slice.
      */
    var alpha: Double
    
    /**
      * Color of a slice.
      */
    var color: String
    
    /**
      * Original object from data provider.
      */
    var dataContext: js.Object
    
    /**
      * Slice description.
      */
    var description: String
    
    /**
      * Specifies whether the slice is hidden
      */
    var hidden: Boolean
    
    /**
      * Percent value of a slice.
      */
    var percents: Double
    
    /**
      * Specifies whether the slice is pulled or not.
      */
    var pulled: Boolean
    
    /**
      * Slice title
      */
    var title: String
    
    /**
      * Url of a slice
      */
    var url: String
    
    /**
      * Value of a slice
      */
    var value: Double
    
    /**
      * specifies whether this slice has a legend entry
      */
    var visibleInLegend: Boolean
  }
  object Slice {
    
    inline def apply(
      alpha: Double,
      color: String,
      dataContext: js.Object,
      description: String,
      hidden: Boolean,
      percents: Double,
      pulled: Boolean,
      title: String,
      url: String,
      value: Double,
      visibleInLegend: Boolean
    ): Slice = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], pulled = pulled.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibleInLegend = visibleInLegend.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDataContext(value: js.Object): Self = StObject.set(x, "dataContext", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setPercents(value: Double): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
      
      inline def setPulled(value: Boolean): Self = StObject.set(x, "pulled", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    }
  }
}
