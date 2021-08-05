package typings.activexLibreoffice.com_.sun.star.text.textfield

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typings.activexLibreoffice.com_.sun.star.text.TextField_
import typings.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docinfo {
  
  /**
    * specifies service of a text field that provides information about the author of the last change.
    * @see com.sun.star.text.TextField
    */
  trait ChangeAuthor
    extends StObject
       with TextField_ {
    
    /** contains the name of the author. */
    var Author: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
    var IsFixed: Boolean
  }
  object ChangeAuthor {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Author: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): ChangeAuthor = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[ChangeAuthor]
    }
    
    extension [Self <: ChangeAuthor](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the date and time the document was last changed.
    * @see com.sun.star.text.TextField
    */
  trait ChangeDateTime
    extends StObject
       with TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double
    
    /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
    var IsDate: Boolean
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved.If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double
  }
  object ChangeDateTime {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      CurrentPresentation: String,
      DateTimeValue: Double,
      IsDate: Boolean,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      IsFixedLanguage: Boolean,
      NumberFormat: Double,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): ChangeDateTime = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], IsDate = IsDate.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[ChangeDateTime]
    }
    
    extension [Self <: ChangeDateTime](x: Self) {
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      inline def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the author who created the document.
    * @see com.sun.star.text.TextField
    */
  trait CreateAuthor
    extends StObject
       with TextField_ {
    
    /** contains the name of the author. */
    var Author: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
    var IsFixed: Boolean
  }
  object CreateAuthor {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Author: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): CreateAuthor = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[CreateAuthor]
    }
    
    extension [Self <: CreateAuthor](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the date and time of the document creation.
    * @see com.sun.star.text.TextField
    */
  trait CreateDateTime
    extends StObject
       with TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double
    
    /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
    var IsDate: Boolean
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double
  }
  object CreateDateTime {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      CurrentPresentation: String,
      DateTimeValue: Double,
      IsDate: Boolean,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      IsFixedLanguage: Boolean,
      NumberFormat: Double,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): CreateDateTime = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], IsDate = IsDate.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[CreateDateTime]
    }
    
    extension [Self <: CreateDateTime](x: Self) {
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      inline def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that refers to the content of a user-defined field in the document information.
    * @see com.sun.star.text.TextField
    * @since OOo 3.0
    */
  trait Custom
    extends StObject
       with TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to `FALSE` , the content is updated when the document information changes. */
    var IsFixed: Boolean
    
    /** the name of the user-defined property that this field refers to. */
    var Name: String
  }
  object Custom {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Custom = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Custom]
    }
    
    extension [Self <: Custom](x: Self) {
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the description that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  trait Description
    extends StObject
       with TextField_ {
    
    /** contains content information. */
    var Content: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean
  }
  object Description {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Content: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Description = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the duration the document has been edited.
    * @see com.sun.star.text.TextField
    */
  trait EditTime
    extends StObject
       with TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double
  }
  object EditTime {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      CurrentPresentation: String,
      DateTimeValue: Double,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      IsFixedLanguage: Boolean,
      NumberFormat: Double,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): EditTime = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[EditTime]
    }
    
    extension [Self <: EditTime](x: Self) {
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the keywords that are contained in the document information.
    * @see com.sun.star.text.TextField
    */
  trait Keywords
    extends StObject
       with TextField_ {
    
    /** contains content information. */
    var Content: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean
  }
  object Keywords {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Content: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Keywords = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Keywords]
    }
    
    extension [Self <: Keywords](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the author of the last print operation.
    * @see com.sun.star.text.TextField
    */
  trait PrintAuthor
    extends StObject
       with TextField_ {
    
    /** contains the name of the author. */
    var Author: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
    var IsFixed: Boolean
  }
  object PrintAuthor {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Author: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): PrintAuthor = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[PrintAuthor]
    }
    
    extension [Self <: PrintAuthor](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the date and time the document was last printed.
    * @see com.sun.star.text.TextField
    */
  trait PrintDateTime
    extends StObject
       with TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double
    
    /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
    var IsDate: Boolean
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double
  }
  object PrintDateTime {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      CurrentPresentation: String,
      DateTimeValue: Double,
      IsDate: Boolean,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      IsFixedLanguage: Boolean,
      NumberFormat: Double,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): PrintDateTime = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], IsDate = IsDate.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[PrintDateTime]
    }
    
    extension [Self <: PrintDateTime](x: Self) {
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      inline def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the revision that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  trait Revision
    extends StObject
       with TextField_ {
    
    /** contains content information. */
    var Content: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean
  }
  object Revision {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Content: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Revision = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Revision]
    }
    
    extension [Self <: Revision](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the subject that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  trait Subject
    extends StObject
       with TextField_ {
    
    /** contains content information. */
    var Content: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean
  }
  object Subject {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Content: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Subject = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Subject]
    }
    
    extension [Self <: Subject](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the title that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  trait Title
    extends StObject
       with TextField_ {
    
    /** contains content information. */
    var Content: String
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean
  }
  object Title {
    
    inline def apply(
      Anchor: XTextRange,
      AnchorType: TextContentAnchorType,
      AnchorTypes: SafeArray[TextContentAnchorType],
      Content: String,
      CurrentPresentation: String,
      IsFieldDisplayed: Boolean,
      IsFieldUsed: Boolean,
      IsFixed: Boolean,
      PropertySetInfo: XPropertySetInfo,
      TextWrap: WrapTextMode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      attach: XTextRange => Unit,
      dispose: () => Unit,
      getAnchor: () => XTextRange,
      getPresentation: Boolean => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Title = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
}
