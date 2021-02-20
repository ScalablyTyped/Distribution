package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameReplace
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.document.XEventsSupplier
import typings.activexLibreoffice.com_.sun.star.drawing.PointSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  /** This service specifies a HTML image map. */
  @js.native
  trait ImageMap
    extends XIndexContainer
       with XNamed
  object ImageMap {
    
    @scala.inline
    def apply(
      Count: Double,
      ElementType: `type`,
      Name: String,
      acquire: () => Unit,
      getByIndex: Double => js.Any,
      getCount: () => Double,
      getElementType: () => `type`,
      getName: () => String,
      hasElements: () => Boolean,
      insertByIndex: (Double, js.Any) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeByIndex: Double => Unit,
      replaceByIndex: (Double, js.Any) => Unit,
      setName: String => Unit
    ): ImageMap = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setName = js.Any.fromFunction1(setName))
      __obj.asInstanceOf[ImageMap]
    }
  }
  
  /**
    * this service describes a circular-shaped region inside a HTML image map.
    * @see ImageMap
    * @see ImageMapObject
    */
  @js.native
  trait ImageMapCircleObject extends ImageMapObject {
    
    /** This is the center point of the circle in pixels */
    var Center: Point = js.native
    
    /** This is the radius of the circle in pixels */
    var Radius: Double = js.native
  }
  object ImageMapCircleObject {
    
    @scala.inline
    def apply(
      Center: Point,
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Radius: Double,
      Target: String,
      URL: String,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getEvents: () => XNameReplace,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): ImageMapCircleObject = {
      val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[ImageMapCircleObject]
    }
    
    @scala.inline
    implicit class ImageMapCircleObjectMutableBuilder[Self <: ImageMapCircleObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Point): Self = StObject.set(x, "Center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * this is a base service for objects inside a image maps.
    * @see ImageMap
    * @see ImageMapRectangleObject
    * @see ImageMapCircleObject
    * @see ImageMapPolygonObject
    */
  @js.native
  trait ImageMapObject
    extends XPropertySet
       with XEventsSupplier {
    
    /** This is an optional description text for the link. */
    var Description: String = js.native
    
    /** If an object is not active, it is ignored when the user clicks on the {@link ImageMap} . */
    var IsActive: Boolean = js.native
    
    /** Optionally, objects could be named. */
    var Name: String = js.native
    
    /** This is the target frame */
    var Target: String = js.native
    
    /** This is the URL for this object */
    var URL: String = js.native
  }
  object ImageMapObject {
    
    @scala.inline
    def apply(
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Target: String,
      URL: String,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getEvents: () => XNameReplace,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): ImageMapObject = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[ImageMapObject]
    }
    
    @scala.inline
    implicit class ImageMapObjectMutableBuilder[Self <: ImageMapObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * this service describes a polygon-shaped region inside a HTML image map.
    * @see ImageMap
    * @see ImageMapObject
    */
  @js.native
  trait ImageMapPolygonObject extends ImageMapObject {
    
    /** This sequence of points outlines the click area of this image map object. */
    var Polygon: PointSequence = js.native
  }
  object ImageMapPolygonObject {
    
    @scala.inline
    def apply(
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      Polygon: PointSequence,
      PropertySetInfo: XPropertySetInfo,
      Target: String,
      URL: String,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getEvents: () => XNameReplace,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): ImageMapPolygonObject = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[ImageMapPolygonObject]
    }
    
    @scala.inline
    implicit class ImageMapPolygonObjectMutableBuilder[Self <: ImageMapPolygonObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolygon(value: PointSequence): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonVarargs(value: Point*): Self = StObject.set(x, "Polygon", js.Array(value :_*))
    }
  }
  
  /**
    * this service describes a rectangular-shaped region inside a HTML image map.
    * @see ImageMap
    * @see ImageMapObject
    */
  @js.native
  trait ImageMapRectangleObject extends ImageMapObject {
    
    /** This is the boundary of this rectangle object */
    var Boundary: Rectangle = js.native
  }
  object ImageMapRectangleObject {
    
    @scala.inline
    def apply(
      Boundary: Rectangle,
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Target: String,
      URL: String,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getEvents: () => XNameReplace,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): ImageMapRectangleObject = {
      val __obj = js.Dynamic.literal(Boundary = Boundary.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[ImageMapRectangleObject]
    }
    
    @scala.inline
    implicit class ImageMapRectangleObjectMutableBuilder[Self <: ImageMapRectangleObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundary(value: Rectangle): Self = StObject.set(x, "Boundary", value.asInstanceOf[js.Any])
    }
  }
}
