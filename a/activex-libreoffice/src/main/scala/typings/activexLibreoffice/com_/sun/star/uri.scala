package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XMacroExpander
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uri {
  
  /**
    * translates between external and internal URI references.
    * @since OOo 2.0
    */
  type ExternalUriReferenceTranslator = XExternalUriReferenceTranslator
  
  /**
    * details how excess special parent segments ( "`..`" ) are handled when resolving a relative URI reference to absolute form.
    * @see com.sun.star.uri.XUriReferenceFactory.makeAbsolute for a method that uses this enumeration.
    * @since OOo 2.0
    */
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  */
  trait RelativeUriExcessParentSegments extends StObject
  object RelativeUriExcessParentSegments {
    
    /** causes excess special parent segments to be treated as an error. */
    inline def ERROR: `0` = 0.asInstanceOf[`0`]
    
    /** causes excess special parent segments to be removed. */
    inline def REMOVE: `2` = 2.asInstanceOf[`2`]
    
    /** causes excess special parent segments to be retained, treating them like ordinary segments. */
    inline def RETAIN: `1` = 1.asInstanceOf[`1`]
  }
  
  /**
    * creates URI references.
    *
    * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URI references and related terms.
    *
    * For parsing absolute URI references, this service tries to use a scheme-specific parser. Such a scheme-specific parser will typically enforce
    * additional restrictions during parsing, and will typically return objects that support extra, scheme-specific interfaces in addition to {@link
    * com.sun.star.uri.XUriReference} . If no such parser is found, and for relative URI references, a generic parser is used, which returns objects that
    * only support {@link com.sun.star.uri.XUriReference} .
    *
    * Locating a scheme-specific parser works as follows: A scheme consists of Latin capital letters "`A`" - "`Z`" , Latin small letters "`a`" - "`z`" ,
    * digits "`0`" - "`9`" , "`+`" , "`-`" , and "`.`" . A scheme  **s** is transformed into a string  **s**' character-by-character, by translating Latin
    * capital letters to their small counterparts, translating "`+`" to "`PLUS`" , "`-`" to "`HYPHEN`" , "`.`" to "`DOT`" , and copying Latin small letters
    * and digits unchanged. If the component context used while creating this `UriReferenceFactory` instance offers a service manager, and there is a
    * service available at that service manager whose name is the concatenation of "`com.sun.star.uri.UriSchemeParser_`" and **s**' , then that service is
    * used. It is an error if that service does not support {@link com.sun.star.uri.XUriSchemeParser} .
    * @since OOo 2.0
    */
  type UriReferenceFactory = XUriReferenceFactory
  
  /**
    * parses textual representations of absolute " vnd.sun.star.expand " URLs.
    *
    * The argument `scheme` of method {@link com.sun.star.uri.XUriSchemeParser.parse()} must always be equal to the `string``"vnd.sun.star.expand"` ,
    * ignoring case. The objects returned by {@link com.sun.star.uri.XUriSchemeParser.parse()} implement {@link
    * com.sun.star.uri.XVndSunStarExpandUrlReference} .
    *
    * This service is not intended to be instantiated directly by client code. Rather, it should be used indirectly through the {@link
    * com.sun.star.uri.UriReferenceFactory} service.
    * @since OOo 2.3
    */
  type UriSchemeParserVndDOTsunDOTstarDOTexpand = XUriSchemeParser
  
  /**
    * parses textual representations of absolute " vnd.sun.star.script " URLs.
    *
    * The argument `scheme` of method {@link com.sun.star.uri.XUriSchemeParser.parse()} must always be equal to the `string``"vnd.sun.star.script"` ,
    * ignoring case. The objects returned by {@link com.sun.star.uri.XUriSchemeParser.parse()} implement {@link
    * com.sun.star.uri.XVndSunStarScriptUrlReference} .
    *
    * This service is not intended to be instantiated directly by client code. Rather, it should be used indirectly through the {@link
    * com.sun.star.uri.UriReferenceFactory} service.
    * @since OOo 2.0
    */
  type UriSchemeParserVndDOTsunDOTstarDOTscript = XUriSchemeParser
  
  /**
    * creates " vnd.sun.star.pkg " URL references.
    * @since OOo 2.0
    */
  type VndSunStarPkgUrlReferenceFactory = XVndSunStarPkgUrlReferenceFactory
  
  /**
    * translates between external and internal URI references.
    *
    * Some URI schemes leave unspecified important aspects of how to interpret URIs of those schemes. For example, it is unspecified for " file " URLs how
    * to map the byte sequences that constitute the path segments of a " file " URL to filenames on a given platform: The UNO environment always assumes
    * that path segments of " file " URLs represent UTF-8  -  encoded strings (which have to be mapped to filenames in a platform-specific way), while other
    * applications typically assume that path segments of " file " URLs directly represent a platform's byte-sequence filenames. This interface offers
    * methods to translate between such `internal` URIs (e.g., UTF-8  -  encoded " file " URLs used within the UNO environment) and `external` URIs (e.g.,
    * byte-sequence  -  oriented " file " URLs used by other applications). Typically, only " file " URLs are affected by this translation.
    *
    * Since the translation process is based on URI schemes, relative URI references (that do not include a scheme) are left unmodified by the translation
    * process.
    * @since OOo 2.0
    */
  trait XExternalUriReferenceTranslator extends StObject {
    
    /**
      * returns the external counterpart of an internal URI reference.
      * @param internalUriReference an internal URI reference.
      * @returns the external counterpart of the given internal URI reference. An empty string is returned if the given internal URI reference either is an empty
      */
    def translateToExternal(internalUriReference: String): String
    
    /**
      * returns the internal counterpart of an external URI reference.
      * @param externalUriReference an external URI reference.
      * @returns the internal counterpart of the given external URI reference. An empty string is returned if the given external URI reference either is an empty
      */
    def translateToInternal(externalUriReference: String): String
  }
  object XExternalUriReferenceTranslator {
    
    inline def apply(translateToExternal: String => String, translateToInternal: String => String): XExternalUriReferenceTranslator = {
      val __obj = js.Dynamic.literal(translateToExternal = js.Any.fromFunction1(translateToExternal), translateToInternal = js.Any.fromFunction1(translateToInternal))
      __obj.asInstanceOf[XExternalUriReferenceTranslator]
    }
    
    extension [Self <: XExternalUriReferenceTranslator](x: Self) {
      
      inline def setTranslateToExternal(value: String => String): Self = StObject.set(x, "translateToExternal", js.Any.fromFunction1(value))
      
      inline def setTranslateToInternal(value: String => String): Self = StObject.set(x, "translateToInternal", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * represents generic, mutable URI references.
    *
    * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URI references and related terms.
    *
    * This interface only handles generic URI references (both absolute and relative). For specific URI schemes, there will be additional interfaces that
    * offer extra, scheme-specific functionality.
    * @see com.sun.star.uri.UriReferenceFactory which allows to create URI reference objects that support com.sun.star.uri.XUriReference and additional, sch
    * @since OOo 2.0
    */
  trait XUriReference
    extends StObject
       with XInterface {
    
    /**
      * returns the authority part of this (hierarchical) URI reference.
      * @returns the textual representation of the authority part (with the exact spelling retained), if this is a hierarchical URI reference that has an authorit
      */
    val Authority: String
    
    /**
      * returns the fragment part of this URI reference.
      * @returns the textual representation of the fragment part (with the exact spelling retained; without the delimiting "`#`" ), if this is a URI reference tha
      */
    var Fragment: String
    
    /**
      * returns the path part of this URI reference.
      * @returns the textual representation of the path part (with the exact spelling retained), if this is a hierarchical URI reference; for an opaque URI refere
      */
    val Path: String
    
    /**
      * returns the number of path segments of this (hierarchical) URI reference.
      *
      * For an opaque URI reference, and for a hierarchical URI reference with an empty path, the number of path segments is zero. For a hierarchical URI
      * reference with an absolute, non-empty path, the number of path segments equals the number of "`/`" delimiters. For a hierarchical URI reference with a
      * relative, non-empty path, the number of path segments equals the number of "`/`" delimiters, plus one.
      * @returns the number of path segments.
      */
    val PathSegmentCount: Double
    
    /**
      * returns the query part of this (hierarchical) URI reference.
      * @returns the textual representation of the query part (with the exact spelling retained; without the delimiting "`?`" ), if this is a hierarchical URI ref
      */
    val Query: String
    
    /**
      * returns the scheme part of this (absolute) URI reference.
      * @returns the textual representation of the scheme part (with the exact spelling retained; without the delimiting "`:`" ), if this is an absolute URI refer
      */
    val Scheme: String
    
    /**
      * returns the scheme-specific part of this URI reference.
      *
      * For an absolute URI reference, the scheme-specific part is everything after the scheme part and the delimiting "`:`" , and before the optional "`#`"
      * and fragment part. For a relative URI reference, the scheme-specific part is everything before the optional "`#`" and fragment part.
      * @returns the textual representation of the scheme-specific part (with the exact spelling retained).
      */
    val SchemeSpecificPart: String
    
    /**
      * returns the textual representation of the complete URI reference.
      * @returns the textual representation of the complete URI reference. The exact spelling of the URI reference is retained.
      */
    val UriReference: String
    
    /** clears the fragment part of this URI reference. */
    def clearFragment(): Unit
    
    /**
      * returns the authority part of this (hierarchical) URI reference.
      * @returns the textual representation of the authority part (with the exact spelling retained), if this is a hierarchical URI reference that has an authorit
      */
    def getAuthority(): String
    
    /**
      * returns the fragment part of this URI reference.
      * @returns the textual representation of the fragment part (with the exact spelling retained; without the delimiting "`#`" ), if this is a URI reference tha
      */
    def getFragment(): String
    
    /**
      * returns the path part of this URI reference.
      * @returns the textual representation of the path part (with the exact spelling retained), if this is a hierarchical URI reference; for an opaque URI refere
      */
    def getPath(): String
    
    /**
      * returns a given path segment of this (hierarchical) URI reference.
      * @param index the index of the path segment, starting at zero.
      * @returns the textual representation of the given path segment (with the exact spelling retained, without any delimiting "`/`" ), if this URI reference is
      */
    def getPathSegment(index: Double): String
    
    /**
      * returns the number of path segments of this (hierarchical) URI reference.
      *
      * For an opaque URI reference, and for a hierarchical URI reference with an empty path, the number of path segments is zero. For a hierarchical URI
      * reference with an absolute, non-empty path, the number of path segments equals the number of "`/`" delimiters. For a hierarchical URI reference with a
      * relative, non-empty path, the number of path segments equals the number of "`/`" delimiters, plus one.
      * @returns the number of path segments.
      */
    def getPathSegmentCount(): Double
    
    /**
      * returns the query part of this (hierarchical) URI reference.
      * @returns the textual representation of the query part (with the exact spelling retained; without the delimiting "`?`" ), if this is a hierarchical URI ref
      */
    def getQuery(): String
    
    /**
      * returns the scheme part of this (absolute) URI reference.
      * @returns the textual representation of the scheme part (with the exact spelling retained; without the delimiting "`:`" ), if this is an absolute URI refer
      */
    def getScheme(): String
    
    /**
      * returns the scheme-specific part of this URI reference.
      *
      * For an absolute URI reference, the scheme-specific part is everything after the scheme part and the delimiting "`:`" , and before the optional "`#`"
      * and fragment part. For a relative URI reference, the scheme-specific part is everything before the optional "`#`" and fragment part.
      * @returns the textual representation of the scheme-specific part (with the exact spelling retained).
      */
    def getSchemeSpecificPart(): String
    
    /**
      * returns the textual representation of the complete URI reference.
      * @returns the textual representation of the complete URI reference. The exact spelling of the URI reference is retained.
      */
    def getUriReference(): String
    
    /**
      * returns whether this (hierarchical) URI reference has an authority part.
      * @returns `TRUE` if this URI reference is hierarchical and has an authority part.
      */
    def hasAuthority(): Boolean
    
    /**
      * returns whether this URI reference has a fragment part.
      * @returns `TRUE` if this URI reference has a fragment part.
      */
    def hasFragment(): Boolean
    
    /**
      * returns whether this (hierarchical) URI reference has a query part.
      * @returns `TRUE` if this URI reference is hierarchical and has a query part.
      */
    def hasQuery(): Boolean
    
    /**
      * returns whether this (relative) URI reference has a relative path.
      * @returns `TRUE` if this URI reference is relative and has a relative path.
      */
    def hasRelativePath(): Boolean
    
    /**
      * returns whether this URI reference is absolute or relative.
      * @returns `TRUE` if this URI reference is absolute, `FALSE` if it is relative.
      */
    def isAbsolute(): Boolean
    
    /**
      * returns whether this URI reference is hierarchical or opaque.
      *
      * An absolute URI reference is hierarchical if its scheme-specific part starts with "`/`" . A relative URI reference is always hierarchical.
      * @returns `TRUE` if this URI reference is hierarchical, `FALSE` if it is opaque.
      */
    def isHierarchical(): Boolean
    
    /**
      * sets the fragment part of this URI reference.
      * @param fragment the textual representation of the new fragment part. The exact spelling will be preserved, and no escaping is performed.
      */
    def setFragment(fragment: String): Unit
  }
  object XUriReference {
    
    inline def apply(
      Authority: String,
      Fragment: String,
      Path: String,
      PathSegmentCount: Double,
      Query: String,
      Scheme: String,
      SchemeSpecificPart: String,
      UriReference: String,
      acquire: () => Unit,
      clearFragment: () => Unit,
      getAuthority: () => String,
      getFragment: () => String,
      getPath: () => String,
      getPathSegment: Double => String,
      getPathSegmentCount: () => Double,
      getQuery: () => String,
      getScheme: () => String,
      getSchemeSpecificPart: () => String,
      getUriReference: () => String,
      hasAuthority: () => Boolean,
      hasFragment: () => Boolean,
      hasQuery: () => Boolean,
      hasRelativePath: () => Boolean,
      isAbsolute: () => Boolean,
      isHierarchical: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      setFragment: String => Unit
    ): XUriReference = {
      val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Fragment = Fragment.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], PathSegmentCount = PathSegmentCount.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], SchemeSpecificPart = SchemeSpecificPart.asInstanceOf[js.Any], UriReference = UriReference.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment))
      __obj.asInstanceOf[XUriReference]
    }
    
    extension [Self <: XUriReference](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
      
      inline def setClearFragment(value: () => Unit): Self = StObject.set(x, "clearFragment", js.Any.fromFunction0(value))
      
      inline def setFragment(value: String): Self = StObject.set(x, "Fragment", value.asInstanceOf[js.Any])
      
      inline def setGetAuthority(value: () => String): Self = StObject.set(x, "getAuthority", js.Any.fromFunction0(value))
      
      inline def setGetFragment(value: () => String): Self = StObject.set(x, "getFragment", js.Any.fromFunction0(value))
      
      inline def setGetPath(value: () => String): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
      
      inline def setGetPathSegment(value: Double => String): Self = StObject.set(x, "getPathSegment", js.Any.fromFunction1(value))
      
      inline def setGetPathSegmentCount(value: () => Double): Self = StObject.set(x, "getPathSegmentCount", js.Any.fromFunction0(value))
      
      inline def setGetQuery(value: () => String): Self = StObject.set(x, "getQuery", js.Any.fromFunction0(value))
      
      inline def setGetScheme(value: () => String): Self = StObject.set(x, "getScheme", js.Any.fromFunction0(value))
      
      inline def setGetSchemeSpecificPart(value: () => String): Self = StObject.set(x, "getSchemeSpecificPart", js.Any.fromFunction0(value))
      
      inline def setGetUriReference(value: () => String): Self = StObject.set(x, "getUriReference", js.Any.fromFunction0(value))
      
      inline def setHasAuthority(value: () => Boolean): Self = StObject.set(x, "hasAuthority", js.Any.fromFunction0(value))
      
      inline def setHasFragment(value: () => Boolean): Self = StObject.set(x, "hasFragment", js.Any.fromFunction0(value))
      
      inline def setHasQuery(value: () => Boolean): Self = StObject.set(x, "hasQuery", js.Any.fromFunction0(value))
      
      inline def setHasRelativePath(value: () => Boolean): Self = StObject.set(x, "hasRelativePath", js.Any.fromFunction0(value))
      
      inline def setIsAbsolute(value: () => Boolean): Self = StObject.set(x, "isAbsolute", js.Any.fromFunction0(value))
      
      inline def setIsHierarchical(value: () => Boolean): Self = StObject.set(x, "isHierarchical", js.Any.fromFunction0(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
      
      inline def setPathSegmentCount(value: Double): Self = StObject.set(x, "PathSegmentCount", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeSpecificPart(value: String): Self = StObject.set(x, "SchemeSpecificPart", value.asInstanceOf[js.Any])
      
      inline def setSetFragment(value: String => Unit): Self = StObject.set(x, "setFragment", js.Any.fromFunction1(value))
      
      inline def setUriReference(value: String): Self = StObject.set(x, "UriReference", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * creates URI references.
    *
    * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URI references and related terms.
    * @since OOo 2.0
    */
  trait XUriReferenceFactory
    extends StObject
       with XInterface {
    
    /**
      * resolves a relative URI reference to absolute form.
      * @param baseUriReference the base URI reference. If the given `uriReference` is a same-document reference, `baseUriReference` is used as a reference to t
      * @param uriReference any URI reference. Backwards-compatible relative URI references starting with a scheme component (see RFC   2396, Section   5.2, ste
      * @param processSpecialBaseSegments if `TRUE` , special segments ( "`.`" and "`..`" ) within the path of the base URI (except for the last, cut-off segmen
      * @param excessParentSegments details how excess special parent segments ( "`..`" ) are handled.
      * @returns a fresh object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given `uri
      */
    def makeAbsolute(
      baseUriReference: XUriReference,
      uriReference: XUriReference,
      processSpecialBaseSegments: Boolean,
      excessParentSegments: RelativeUriExcessParentSegments
    ): XUriReference
    
    /**
      * changes an absolute URI reference to relative form.
      * @param baseUriReference the base URI reference.
      * @param uriReference any URI reference.
      * @param preferAuthorityOverRelativePath controls how a relative URI reference is generated when both `baseUriReference` (e.g., "`scheme://auth/a/b`" ) an
      * @param preferAbsoluteOverRelativePath controls how a relative URI reference is generated when both `baseUriReference` (e.g., "`scheme://auth/a/b`" ) and
      * @param encodeRetainedSpecialSegments if `TRUE` , special segments ( "`.`" and "`..`" ) that are already present in the path component of the given `uriR
      * @returns a fresh object that supports {@link com.sun.star.uri.XUriReference} , if the given `uriReference` is either already relative, or is not hierarchi
      */
    def makeRelative(
      baseUriReference: XUriReference,
      uriReference: XUriReference,
      preferAuthorityOverRelativePath: Boolean,
      preferAbsoluteOverRelativePath: Boolean,
      encodeRetainedSpecialSegments: Boolean
    ): XUriReference
    
    /**
      * parses the textual representation of a URI reference.
      * @param uriReference the textual representation of a URI reference.
      * @returns an object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given input can
      */
    def parse(uriReference: String): XUriReference
  }
  object XUriReferenceFactory {
    
    inline def apply(
      acquire: () => Unit,
      makeAbsolute: (XUriReference, XUriReference, Boolean, RelativeUriExcessParentSegments) => XUriReference,
      makeRelative: (XUriReference, XUriReference, Boolean, Boolean, Boolean) => XUriReference,
      parse: String => XUriReference,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XUriReferenceFactory = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), makeAbsolute = js.Any.fromFunction4(makeAbsolute), makeRelative = js.Any.fromFunction5(makeRelative), parse = js.Any.fromFunction1(parse), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XUriReferenceFactory]
    }
    
    extension [Self <: XUriReferenceFactory](x: Self) {
      
      inline def setMakeAbsolute(value: (XUriReference, XUriReference, Boolean, RelativeUriExcessParentSegments) => XUriReference): Self = StObject.set(x, "makeAbsolute", js.Any.fromFunction4(value))
      
      inline def setMakeRelative(value: (XUriReference, XUriReference, Boolean, Boolean, Boolean) => XUriReference): Self = StObject.set(x, "makeRelative", js.Any.fromFunction5(value))
      
      inline def setParse(value: String => XUriReference): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * parses textual representations of absolute URIs.
    *
    * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URIs and related terms.
    * @since OOo 2.0
    */
  trait XUriSchemeParser
    extends StObject
       with XInterface {
    
    /**
      * parses the textual representation of an absolute URI.
      *
      * This method is used to parse URIs (with no fragment part), not URI references (with an optional fragment part).
      *
      * If an object is returned, the behaviour of its {@link com.sun.star.uri.XUriReference} methods must reflect the fact that the object represents an
      * absolute URI reference with the given scheme and scheme-specific part, and without a fragment part.
      * @param scheme the textual representation of the scheme part (without the delimiting "`:`" ).
      * @param schemeSpecificPart the textual representation of the scheme-specific part.
      * @returns an object that supports {@link com.sun.star.uri.XUriReference} (and possibly also additional, scheme-specific interfaces), if the given input can
      */
    def parse(scheme: String, schemeSpecificPart: String): XUriReference
  }
  object XUriSchemeParser {
    
    inline def apply(
      acquire: () => Unit,
      parse: (String, String) => XUriReference,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XUriSchemeParser = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), parse = js.Any.fromFunction2(parse), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XUriSchemeParser]
    }
    
    extension [Self <: XUriSchemeParser](x: Self) {
      
      inline def setParse(value: (String, String) => XUriReference): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * represents absolute " vnd.sun.star.expand " URLs.
    *
    * These URLs are of the form ;    **vnd-sun-star-expand-url** = `"VND.SUN.STAR.EXPAND:"`**opaque_part**;  where the **opaque_part** is an UTF-8 string
    * as described in [Bootstrap Arguments and Micro Deployment]{@link url="http://udk.openoffice.org/common/man/concept/micro_deployment.html"} . See [RFC
    *  2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} , [RFC   2732]{@link url="http://www.ietf.org/rfc/rfc2732.txt"} , and [RFC   2234]{@link
    * url="http://www.ietf.org/rfc/rfc2234.txt"} for details.
    * @since OOo 2.3
    */
  trait XVndSunStarExpandUrl extends StObject {
    
    /**
      * returns the expanded content of this URL.
      * @param expander a macro expander; must not be `NULL` .
      * @returns the expanded content of this URL.
      * @throws com::sun::star::lang::IllegalArgumentException if calling {@link com.sun.star.util.XMacroExpander.expandMacros()} on `expander` raises any such e
      */
    def expand(expander: XMacroExpander): String
  }
  object XVndSunStarExpandUrl {
    
    inline def apply(expand: XMacroExpander => String): XVndSunStarExpandUrl = {
      val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
      __obj.asInstanceOf[XVndSunStarExpandUrl]
    }
    
    extension [Self <: XVndSunStarExpandUrl](x: Self) {
      
      inline def setExpand(value: XMacroExpander => String): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * represents absolute " vnd.sun.star.expand " URL references.
    * @since OOo 2.3
    */
  trait XVndSunStarExpandUrlReference
    extends StObject
       with XUriReference
       with XVndSunStarExpandUrl
  object XVndSunStarExpandUrlReference {
    
    inline def apply(
      Authority: String,
      Fragment: String,
      Path: String,
      PathSegmentCount: Double,
      Query: String,
      Scheme: String,
      SchemeSpecificPart: String,
      UriReference: String,
      acquire: () => Unit,
      clearFragment: () => Unit,
      expand: XMacroExpander => String,
      getAuthority: () => String,
      getFragment: () => String,
      getPath: () => String,
      getPathSegment: Double => String,
      getPathSegmentCount: () => Double,
      getQuery: () => String,
      getScheme: () => String,
      getSchemeSpecificPart: () => String,
      getUriReference: () => String,
      hasAuthority: () => Boolean,
      hasFragment: () => Boolean,
      hasQuery: () => Boolean,
      hasRelativePath: () => Boolean,
      isAbsolute: () => Boolean,
      isHierarchical: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      setFragment: String => Unit
    ): XVndSunStarExpandUrlReference = {
      val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Fragment = Fragment.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], PathSegmentCount = PathSegmentCount.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], SchemeSpecificPart = SchemeSpecificPart.asInstanceOf[js.Any], UriReference = UriReference.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), expand = js.Any.fromFunction1(expand), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment))
      __obj.asInstanceOf[XVndSunStarExpandUrlReference]
    }
  }
  
  /**
    * creates " vnd.sun.star.pkg " URL references.
    * @since OOo 2.0
    */
  trait XVndSunStarPkgUrlReferenceFactory extends StObject {
    
    /**
      * creates a new " vnd.sun.star.pkg " URL reference.
      *
      * The returned URL reference has the given authority, an empty path, and no fragment.
      * @param authority the authority of the created URL reference; must not be `NULL` , and should be an absolute URI reference with no fragment
      * @returns a new " vnd.sun.star.pkg " URL reference, or `NULL` if the given authority is either not an absolute URI reference or has a fragment
      */
    def createVndSunStarPkgUrlReference(authority: XUriReference): XUriReference
  }
  object XVndSunStarPkgUrlReferenceFactory {
    
    inline def apply(createVndSunStarPkgUrlReference: XUriReference => XUriReference): XVndSunStarPkgUrlReferenceFactory = {
      val __obj = js.Dynamic.literal(createVndSunStarPkgUrlReference = js.Any.fromFunction1(createVndSunStarPkgUrlReference))
      __obj.asInstanceOf[XVndSunStarPkgUrlReferenceFactory]
    }
    
    extension [Self <: XVndSunStarPkgUrlReferenceFactory](x: Self) {
      
      inline def setCreateVndSunStarPkgUrlReference(value: XUriReference => XUriReference): Self = StObject.set(x, "createVndSunStarPkgUrlReference", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * represents absolute " vnd.sun.star.script " URLs.
    *
    * These URLs are of the form ;    **vnd-sun-star-script-url** = `"VND.SUN.STAR.SCRIPT:"`**name** [ `"?"`**parameter** *( `"&"`**parameter** )] ;
    * **name** = 1* **schar**;    **parameter** = **key**`"="`**value**;    **key** = 1* **schar**;    **value** = * **schar**;    **schar** =
    * **unreserved** / **escaped** / `"$"` / `"+"` / `","` / `":"` / `";"` / `"@"` / `"["` / `"]"`;  See [RFC   2396]{@link
    * url="http://www.ietf.org/rfc/rfc2396.txt"} , [RFC   2732]{@link url="http://www.ietf.org/rfc/rfc2732.txt"} , and [RFC   2234]{@link
    * url="http://www.ietf.org/rfc/rfc2234.txt"} for details.
    *
    * The names, keys, and values are arbitrary Unicode strings (non-empty Unicode strings in the case of names and keys), encoded as UTF-8 byte sequences.
    * It is an error if any of them does not represent a valid UTF-8 byte sequence. Keys are compared for equality character-by-character, without
    * considering case folding or normalization. There may be multiple parameters with equal keys.
    * @since OOo 2.0
    */
  trait XVndSunStarScriptUrl
    extends StObject
       with XInterface {
    
    /**
      * returns the name part of this URL.
      * @returns the non-escaped value of the name part.
      */
    var Name: String
    
    /**
      * returns the name part of this URL.
      * @returns the non-escaped value of the name part.
      */
    def getName(): String
    
    /**
      * returns the value of a parameter with a given key.
      * @param key a non-escaped key.
      * @returns the non-escaped value of the first parameter with the given key. If there is no parameter with the given key, or if `key` is an empty `string` ,
      */
    def getParameter(key: String): String
    
    /**
      * returns whether this URL has a parameter with a given key.
      * @param key a non-escaped key.
      * @returns `TRUE` if this URL has at least one parameter with the given key. In particular, if `key` is an empty `string` , `FALSE` is returned.
      */
    def hasParameter(key: String): Boolean
    
    /**
      * sets the name part of this URL.
      * @param name specifies the non-escaped new name part of the URL.
      * @since OOo 3.0
      * @throws com::sun::star::lang::IllegalArgumentException if name is empty
      */
    def setName(name: String): Unit
    
    /**
      * sets the value of a parameter with a given key.
      * @param key a non-escaped key
      * @param value the non-escaped value to be set for the parameter. If there already is a parameter with this key, the value of its first appearance will be
      * @since OOo 3.0
      * @throws com::sun::star::lang::IllegalArgumentException if key is empty
      */
    def setParameter(key: String, value: String): Unit
  }
  object XVndSunStarScriptUrl {
    
    inline def apply(
      Name: String,
      acquire: () => Unit,
      getName: () => String,
      getParameter: String => String,
      hasParameter: String => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      setName: String => Unit,
      setParameter: (String, String) => Unit
    ): XVndSunStarScriptUrl = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getParameter = js.Any.fromFunction1(getParameter), hasParameter = js.Any.fromFunction1(hasParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParameter = js.Any.fromFunction2(setParameter))
      __obj.asInstanceOf[XVndSunStarScriptUrl]
    }
    
    extension [Self <: XVndSunStarScriptUrl](x: Self) {
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetParameter(value: String => String): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
      
      inline def setHasParameter(value: String => Boolean): Self = StObject.set(x, "hasParameter", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetParameter(value: (String, String) => Unit): Self = StObject.set(x, "setParameter", js.Any.fromFunction2(value))
    }
  }
  
  /** represents absolute " vnd.sun.star.script " URL references. */
  trait XVndSunStarScriptUrlReference
    extends StObject
       with XUriReference
       with XVndSunStarScriptUrl
  object XVndSunStarScriptUrlReference {
    
    inline def apply(
      Authority: String,
      Fragment: String,
      Name: String,
      Path: String,
      PathSegmentCount: Double,
      Query: String,
      Scheme: String,
      SchemeSpecificPart: String,
      UriReference: String,
      acquire: () => Unit,
      clearFragment: () => Unit,
      getAuthority: () => String,
      getFragment: () => String,
      getName: () => String,
      getParameter: String => String,
      getPath: () => String,
      getPathSegment: Double => String,
      getPathSegmentCount: () => Double,
      getQuery: () => String,
      getScheme: () => String,
      getSchemeSpecificPart: () => String,
      getUriReference: () => String,
      hasAuthority: () => Boolean,
      hasFragment: () => Boolean,
      hasParameter: String => Boolean,
      hasQuery: () => Boolean,
      hasRelativePath: () => Boolean,
      isAbsolute: () => Boolean,
      isHierarchical: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      setFragment: String => Unit,
      setName: String => Unit,
      setParameter: (String, String) => Unit
    ): XVndSunStarScriptUrlReference = {
      val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Fragment = Fragment.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], PathSegmentCount = PathSegmentCount.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], SchemeSpecificPart = SchemeSpecificPart.asInstanceOf[js.Any], UriReference = UriReference.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearFragment = js.Any.fromFunction0(clearFragment), getAuthority = js.Any.fromFunction0(getAuthority), getFragment = js.Any.fromFunction0(getFragment), getName = js.Any.fromFunction0(getName), getParameter = js.Any.fromFunction1(getParameter), getPath = js.Any.fromFunction0(getPath), getPathSegment = js.Any.fromFunction1(getPathSegment), getPathSegmentCount = js.Any.fromFunction0(getPathSegmentCount), getQuery = js.Any.fromFunction0(getQuery), getScheme = js.Any.fromFunction0(getScheme), getSchemeSpecificPart = js.Any.fromFunction0(getSchemeSpecificPart), getUriReference = js.Any.fromFunction0(getUriReference), hasAuthority = js.Any.fromFunction0(hasAuthority), hasFragment = js.Any.fromFunction0(hasFragment), hasParameter = js.Any.fromFunction1(hasParameter), hasQuery = js.Any.fromFunction0(hasQuery), hasRelativePath = js.Any.fromFunction0(hasRelativePath), isAbsolute = js.Any.fromFunction0(isAbsolute), isHierarchical = js.Any.fromFunction0(isHierarchical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFragment = js.Any.fromFunction1(setFragment), setName = js.Any.fromFunction1(setName), setParameter = js.Any.fromFunction2(setParameter))
      __obj.asInstanceOf[XVndSunStarScriptUrlReference]
    }
  }
}
