package typings.activexWia

import typings.activexWia.WIA.DeviceCommands
import typings.activexWia.WIA.DeviceEvents
import typings.activexWia.WIA.FilterInfos
import typings.activexWia.WIA.Filters
import typings.activexWia.WIA.Items
import typings.activexWia.WIA.Properties
import typings.activexWia.WIA.Vector
import typings.activexWia.WIA.WiaDeviceType
import typings.activexWia.WIA.WiaEventFlag
import typings.activexWia.WIA.WiaSubType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WIA {
    
    /**
      * The CommonDialog control is an invisible-at-runtime control that contains all the methods that display a User Interface. A CommonDialog control can be
      * created using "WIA.CommonDialog" in a call to CreateObject or by dropping a CommonDialog on a form.
      */
    @JSGlobal("WIA.CommonDialog")
    @js.native
    class CommonDialog protected ()
      extends StObject
         with typings.activexWia.WIA.CommonDialog
    
    /** The Device object represents an active connection to an imaging device. */
    @JSGlobal("WIA.Device")
    @js.native
    class Device protected ()
      extends StObject
         with typings.activexWia.WIA.Device {
      
      /** Returns the specified item in the collection by position */
      /** A collection of all commands for this imaging device */
      /* CompleteClass */
      override def Commands(Index: Double): typings.activexWia.WIA.DeviceCommand = js.native
      /** A collection of all commands for this imaging device */
      /* CompleteClass */
      @JSName("Commands")
      override val Commands_Original: DeviceCommands = js.native
      
      /** Returns the DeviceID for this Device */
      /* CompleteClass */
      override val DeviceID: String = js.native
      
      /** Returns the specified item in the collection by position */
      /** A collection of all events for this imaging device */
      /* CompleteClass */
      override def Events(Index: Double): typings.activexWia.WIA.DeviceEvent = js.native
      /** A collection of all events for this imaging device */
      /* CompleteClass */
      @JSName("Events")
      override val Events_Original: DeviceEvents = js.native
      
      /**
        * Issues the command specified by CommandID to the imaging device. CommandIDs are device dependent. Valid CommandIDs for this Device are contained in
        * the Commands collection.
        */
      /* CompleteClass */
      override def ExecuteCommand(CommandID: String): typings.activexWia.WIA.Item = js.native
      
      /** Returns the Item object specified by ItemID if it exists */
      /* CompleteClass */
      override def GetItem(ItemID: String): typings.activexWia.WIA.Item = js.native
      
      /** Returns the specified item in the collection by position */
      /** A collection of all items for this imaging device */
      /* CompleteClass */
      override def Items(Index: Double): typings.activexWia.WIA.Item = js.native
      /** A collection of all items for this imaging device */
      /* CompleteClass */
      @JSName("Items")
      override val Items_Original: Items = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): typings.activexWia.WIA.Property = js.native
      /** Returns the specified item in the collection either by position or name. */
      /** A collection of all properties for this imaging device */
      /* CompleteClass */
      override def Properties(Index: Double): typings.activexWia.WIA.Property = js.native
      /** A collection of all properties for this imaging device */
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /** Returns the Type of Device */
      /* CompleteClass */
      override val Type: WiaDeviceType = js.native
      
      /* CompleteClass */
      @JSName("WIA.Device_typekey")
      var WIADotDevice_typekey: typings.activexWia.WIA.Device = js.native
    }
    
    /** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
    @JSGlobal("WIA.DeviceCommand")
    @js.native
    class DeviceCommand protected ()
      extends StObject
         with typings.activexWia.WIA.DeviceCommand {
      
      /** Returns the commandID for this Command */
      /* CompleteClass */
      override val CommandID: String = js.native
      
      /** Returns the command Description */
      /* CompleteClass */
      override val Description: String = js.native
      
      /** Returns the command Name */
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      @JSName("WIA.DeviceCommand_typekey")
      var WIADotDeviceCommand_typekey: typings.activexWia.WIA.DeviceCommand = js.native
    }
    
    /** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
    @JSGlobal("WIA.DeviceEvent")
    @js.native
    class DeviceEvent protected ()
      extends StObject
         with typings.activexWia.WIA.DeviceEvent {
      
      /** Returns the event Description */
      /* CompleteClass */
      override val Description: String = js.native
      
      /** Returns the EventID for this Event */
      /* CompleteClass */
      override val EventID: String = js.native
      
      /** Returns the event Name */
      /* CompleteClass */
      override val Name: String = js.native
      
      /** Returns the Type of this Event */
      /* CompleteClass */
      override val Type: WiaEventFlag = js.native
      
      /* CompleteClass */
      @JSName("WIA.DeviceEvent_typekey")
      var WIADotDeviceEvent_typekey: typings.activexWia.WIA.DeviceEvent = js.native
    }
    
    /**
      * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the
      * computer.
      */
    @JSGlobal("WIA.DeviceInfo")
    @js.native
    class DeviceInfo protected ()
      extends StObject
         with typings.activexWia.WIA.DeviceInfo {
      
      /** Establish a connection with this device and return a Device object */
      /* CompleteClass */
      override def Connect(): typings.activexWia.WIA.Device = js.native
      
      /** Returns the DeviceID for this Device */
      /* CompleteClass */
      override val DeviceID: String = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): typings.activexWia.WIA.Property = js.native
      /** Returns the specified item in the collection either by position or name. */
      /** A collection of all properties for this imaging device that are applicable when the device is not connected */
      /* CompleteClass */
      override def Properties(Index: Double): typings.activexWia.WIA.Property = js.native
      /** A collection of all properties for this imaging device that are applicable when the device is not connected */
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /** Returns the Type of Device */
      /* CompleteClass */
      override val Type: WiaDeviceType = js.native
      
      /* CompleteClass */
      @JSName("WIA.DeviceInfo_typekey")
      var WIADotDeviceInfo_typekey: typings.activexWia.WIA.DeviceInfo = js.native
    }
    
    /**
      * The DeviceManager control is an invisible-at-runtime control that manages the imaging devices connected to the computer. A DeviceManager control can
      * be created using "WIA.DeviceManager" in a call to CreateObject or by dropping a DeviceManager on a form.
      */
    @JSGlobal("WIA.DeviceManager")
    @js.native
    class DeviceManager protected ()
      extends StObject
         with typings.activexWia.WIA.DeviceManager
    
    /**
      * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's
      * properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
      */
    @JSGlobal("WIA.Filter")
    @js.native
    class Filter protected ()
      extends StObject
         with typings.activexWia.WIA.Filter {
      
      /** Returns a Description of what the filter does */
      /* CompleteClass */
      override val Description: String = js.native
      
      /** Returns the FilterID for this Filter */
      /* CompleteClass */
      override val FilterID: String = js.native
      
      /** Returns the Filter Name */
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): typings.activexWia.WIA.Property = js.native
      /** Returns the specified item in the collection either by position or name. */
      /** A collection of all properties for this filter */
      /* CompleteClass */
      override def Properties(Index: Double): typings.activexWia.WIA.Property = js.native
      /** A collection of all properties for this filter */
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      @JSName("WIA.Filter_typekey")
      var WIADotFilter_typekey: typings.activexWia.WIA.Filter = js.native
    }
    
    /**
      * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
      * property on the ImageProcess object for details on accessing FilterInfo objects.
      */
    @JSGlobal("WIA.FilterInfo")
    @js.native
    class FilterInfo protected ()
      extends StObject
         with typings.activexWia.WIA.FilterInfo {
      
      /** Returns a technical Description of what the filter does and how to use it in a filter chain */
      /* CompleteClass */
      override val Description: String = js.native
      
      /** Returns the FilterID for this filter */
      /* CompleteClass */
      override val FilterID: String = js.native
      
      /** Returns the FilterInfo Name */
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      @JSName("WIA.FilterInfo_typekey")
      var WIADotFilterInfo_typekey: typings.activexWia.WIA.FilterInfo = js.native
    }
    
    /**
      * The ImageFile object is a container for images transferred to your computer when you call Transfer or ShowTransfer. It also supports image files
      * through LoadFile. An ImageFile object can be created using "WIA.ImageFile" in a call to CreateObject.
      */
    @JSGlobal("WIA.ImageFile")
    @js.native
    class ImageFile protected ()
      extends StObject
         with typings.activexWia.WIA.ImageFile {
      
      /** Returns the specified item in the vector by position */
      /** Returns the raw image bits as a Vector of Long values */
      /* CompleteClass */
      override def ARGBData(Index: Double): js.Any = js.native
      /** Returns the raw image bits as a Vector of Long values */
      /* CompleteClass */
      @JSName("ARGBData")
      override val ARGBData_Original: Vector[js.Any] = js.native
      
      /** Returns/Sets the current frame in the image */
      /* CompleteClass */
      var ActiveFrame: Double = js.native
      
      /** Returns the specified item in the vector by position */
      /** Returns the raw image file as a Vector of Bytes */
      /* CompleteClass */
      override def FileData(Index: Double): js.Any = js.native
      /** Returns the raw image file as a Vector of Bytes */
      /* CompleteClass */
      @JSName("FileData")
      override val FileData_Original: Vector[js.Any] = js.native
      
      /** Returns the file extension for this image file type */
      /* CompleteClass */
      override val FileExtension: String = js.native
      
      /** Returns the FormatID for this file type */
      /* CompleteClass */
      override val FormatID: String = js.native
      
      /** Returns the number of frames in the image */
      /* CompleteClass */
      override val FrameCount: Double = js.native
      
      /** Returns the Height of the image in pixels */
      /* CompleteClass */
      override val Height: Double = js.native
      
      /** Returns the Horizontal pixels per inch of the image */
      /* CompleteClass */
      override val HorizontalResolution: Double = js.native
      
      /** Indicates if the pixel format has an alpha component */
      /* CompleteClass */
      override val IsAlphaPixelFormat: Boolean = js.native
      
      /** Indicates whether the image is animated */
      /* CompleteClass */
      override val IsAnimated: Boolean = js.native
      
      /** Indicates if the pixel format is extended (16 bits/channel) */
      /* CompleteClass */
      override val IsExtendedPixelFormat: Boolean = js.native
      
      /** Indicates if the pixel data is an index into a palette or the actual color data */
      /* CompleteClass */
      override val IsIndexedPixelFormat: Boolean = js.native
      
      /** Loads the ImageFile object with the specified File */
      /* CompleteClass */
      override def LoadFile(Filename: String): Unit = js.native
      
      /** Returns the depth of the pixels of the image in bits per pixel */
      /* CompleteClass */
      override val PixelDepth: Double = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): typings.activexWia.WIA.Property = js.native
      /** Returns the specified item in the collection either by position or name. */
      /** A collection of all properties for this image */
      /* CompleteClass */
      override def Properties(Index: Double): typings.activexWia.WIA.Property = js.native
      /** A collection of all properties for this image */
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /** Save the ImageFile object to the specified File */
      /* CompleteClass */
      override def SaveFile(Filename: String): Unit = js.native
      
      /** Returns the Vertical pixels per inch of the image */
      /* CompleteClass */
      override val VerticalResolution: Double = js.native
      
      /* CompleteClass */
      @JSName("WIA.ImageFile_typekey")
      var WIADotImageFile_typekey: typings.activexWia.WIA.ImageFile = js.native
      
      /** Returns the Width of the image in pixels */
      /* CompleteClass */
      override val Width: Double = js.native
    }
    
    /** The ImageProcess object manages the filter chain. An ImageProcess object can be created using "WIA.ImageProcess" in a call to CreateObject. */
    @JSGlobal("WIA.ImageProcess")
    @js.native
    class ImageProcess protected ()
      extends StObject
         with typings.activexWia.WIA.ImageProcess {
      
      /** Takes the specified ImageFile and returns the new ImageFile with all the filters applied on success */
      /* CompleteClass */
      override def Apply(Source: typings.activexWia.WIA.ImageFile): typings.activexWia.WIA.ImageFile = js.native
      
      /* CompleteClass */
      override def FilterInfos(Index: String): typings.activexWia.WIA.FilterInfo = js.native
      /** Returns the specified item in the collection either by position or name */
      /** A collection of all available filters */
      /* CompleteClass */
      override def FilterInfos(Index: Double): typings.activexWia.WIA.FilterInfo = js.native
      /** A collection of all available filters */
      /* CompleteClass */
      @JSName("FilterInfos")
      override val FilterInfos_Original: FilterInfos = js.native
      
      /** Returns the specified item in the collection by position or FilterID */
      /** A collection of the filters to be applied in this process */
      /* CompleteClass */
      override def Filters(Index: Double): typings.activexWia.WIA.Filter = js.native
      /** A collection of the filters to be applied in this process */
      /* CompleteClass */
      @JSName("Filters")
      override val Filters_Original: Filters = js.native
      
      /* CompleteClass */
      @JSName("WIA.ImageProcess_typekey")
      var WIADotImageProcess_typekey: typings.activexWia.WIA.ImageProcess = js.native
    }
    
    /**
      * The Item object is a container for an item on an imaging device object. See the Items property on the Device or Item object for details on accessing
      * Item objects.
      */
    @JSGlobal("WIA.Item")
    @js.native
    class Item protected ()
      extends StObject
         with typings.activexWia.WIA.Item
    
    /**
      * The Property object is a container for a property associated with a Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property
      * on any of these objects for details on accessing Property objects.
      */
    @JSGlobal("WIA.Property")
    @js.native
    class Property protected ()
      extends StObject
         with typings.activexWia.WIA.Property {
      
      /** Indicates whether the Property Value is read only */
      /* CompleteClass */
      override val IsReadOnly: Boolean = js.native
      
      /** Indicates whether the Property Value is a vector */
      /* CompleteClass */
      override val IsVector: Boolean = js.native
      
      /** Returns the Property Name */
      /* CompleteClass */
      override val Name: String = js.native
      
      /** Returns the PropertyID of this Property */
      /* CompleteClass */
      override val PropertyID: Double = js.native
      
      /** Returns the SubType of the Property, if any */
      /* CompleteClass */
      override val SubType: WiaSubType = js.native
      
      /** Returns the default Property Value if the SubType is not UnspecifiedSubType */
      /* CompleteClass */
      override val SubTypeDefault: js.Any = js.native
      
      /** Returns the maximum valid Property Value if the SubType is RangeSubType */
      /* CompleteClass */
      override val SubTypeMax: Double = js.native
      
      /** Returns the minimum valid Property Value if the SubType is RangeSubType */
      /* CompleteClass */
      override val SubTypeMin: Double = js.native
      
      /** Returns the step increment of Property Values if the SubType is RangeSubType */
      /* CompleteClass */
      override val SubTypeStep: Double = js.native
      
      /** Returns the specified item in the vector by position */
      /** Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType */
      /* CompleteClass */
      override def SubTypeValues(Index: Double): js.Any = js.native
      /** Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType */
      /* CompleteClass */
      @JSName("SubTypeValues")
      override val SubTypeValues_Original: Vector[js.Any] = js.native
      
      /** Returns either a WiaPropertyType or a WiaImagePropertyType */
      /* CompleteClass */
      override val Type: Double = js.native
      
      /** Returns/Sets the Property Value */
      /* CompleteClass */
      var Value: js.Any = js.native
      
      /* CompleteClass */
      @JSName("WIA.Property_typekey")
      var WIADotProperty_typekey: typings.activexWia.WIA.Property = js.native
    }
    
    /**
      * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
      * using "WIA.Rational" in a call to CreateObject.
      */
    @JSGlobal("WIA.Rational")
    @js.native
    class Rational protected ()
      extends StObject
         with typings.activexWia.WIA.Rational {
      
      /** Returns/Sets the Rational Value Denominator */
      /* CompleteClass */
      var Denominator: Double = js.native
      
      /** Returns/Sets the Rational Value Numerator */
      /* CompleteClass */
      var Numerator: Double = js.native
      
      /** Returns the Rational Value as a Double */
      /* CompleteClass */
      override val Value: Double = js.native
      
      /* CompleteClass */
      @JSName("WIA.Rational_typekey")
      var WIADotRational_typekey: typings.activexWia.WIA.Rational = js.native
    }
  }
}
