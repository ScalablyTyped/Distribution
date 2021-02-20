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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docinfo {
  
  /**
    * specifies service of a text field that provides information about the author of the last change.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait ChangeAuthor extends TextField_ {
    
    /** contains the name of the author. */
    var Author: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
    var IsFixed: Boolean = js.native
  }
  object ChangeAuthor {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ChangeAuthorMutableBuilder[Self <: ChangeAuthor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the date and time the document was last changed.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait ChangeDateTime extends TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double = js.native
    
    /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
    var IsDate: Boolean = js.native
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved.If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean = js.native
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean = js.native
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double = js.native
  }
  object ChangeDateTime {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ChangeDateTimeMutableBuilder[Self <: ChangeDateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the author who created the document.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait CreateAuthor extends TextField_ {
    
    /** contains the name of the author. */
    var Author: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
    var IsFixed: Boolean = js.native
  }
  object CreateAuthor {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CreateAuthorMutableBuilder[Self <: CreateAuthor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the date and time of the document creation.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait CreateDateTime extends TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double = js.native
    
    /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
    var IsDate: Boolean = js.native
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean = js.native
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean = js.native
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double = js.native
  }
  object CreateDateTime {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CreateDateTimeMutableBuilder[Self <: CreateDateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that refers to the content of a user-defined field in the document information.
    * @see com.sun.star.text.TextField
    * @since OOo 3.0
    */
  @js.native
  trait Custom extends TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to `FALSE` , the content is updated when the document information changes. */
    var IsFixed: Boolean = js.native
    
    /** the name of the user-defined property that this field refers to. */
    var Name: String = js.native
  }
  object Custom {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the description that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait Description extends TextField_ {
    
    /** contains content information. */
    var Content: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean = js.native
  }
  object Description {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the duration the document has been edited.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait EditTime extends TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double = js.native
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean = js.native
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean = js.native
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double = js.native
  }
  object EditTime {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EditTimeMutableBuilder[Self <: EditTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the keywords that are contained in the document information.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait Keywords extends TextField_ {
    
    /** contains content information. */
    var Content: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean = js.native
  }
  object Keywords {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class KeywordsMutableBuilder[Self <: Keywords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the author of the last print operation.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait PrintAuthor extends TextField_ {
    
    /** contains the name of the author. */
    var Author: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
    var IsFixed: Boolean = js.native
  }
  object PrintAuthor {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PrintAuthorMutableBuilder[Self <: PrintAuthor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides information about the date and time the document was last printed.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait PrintDateTime extends TextField_ {
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** contains the date and time as double value. */
    var DateTimeValue: Double = js.native
    
    /** If this flag is set to `TRUE` this field represents, a date with an optional time. If it is set to `FALSE` only the time is used here. */
    var IsDate: Boolean = js.native
    
    /**
      * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
      * date or time is always displayed as the current date or time.
      * @since OOo 1.1.2
      */
    var IsFixed: Boolean = js.native
    
    /**
      * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
      * language.
      */
    var IsFixedLanguage: Boolean = js.native
    
    /**
      * this is the number format for this field.
      * @see com.sun.star.util.NumberFormatter
      */
    var NumberFormat: Double = js.native
  }
  object PrintDateTime {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PrintDateTimeMutableBuilder[Self <: PrintDateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeValue(value: Double): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the revision that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait Revision extends TextField_ {
    
    /** contains content information. */
    var Content: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean = js.native
  }
  object Revision {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the subject that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait Subject extends TextField_ {
    
    /** contains content information. */
    var Content: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean = js.native
  }
  object Subject {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SubjectMutableBuilder[Self <: Subject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a text field that provides the title that is contained in the document information.
    * @see com.sun.star.text.TextField
    */
  @js.native
  trait Title extends TextField_ {
    
    /** contains content information. */
    var Content: String = js.native
    
    /**
      * contains the current content of the text field.
      *
      * This property is especially useful for import/export purposes.
      */
    var CurrentPresentation: String = js.native
    
    /** If this flag is set to `FALSE` the content updated every time the document information is changed. */
    var IsFixed: Boolean = js.native
  }
  object Title {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    }
  }
}
