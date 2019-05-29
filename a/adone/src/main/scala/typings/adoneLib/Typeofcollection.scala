package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcollection extends js.Object {
  /**
    * Represents an AVL tree, a self-balancing binary search tree
    */
  var AVLTree: org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      /* options */ adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
        adoneLib.adoneNs.collectionNs.AVLTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    adoneLib.adoneNs.collectionNs.AVLTree[js.Object, js.Object]
  ]
  /**
    * Respresetns a data structure which is a combination of an array and a set.
    * Adding a new member is O(1), testing for membership is O(1),
    * and finding the index of an element is O(1).
    */
  var ArraySet: TypeofClassArraySet
  /**
    * Represents an asynchronous queue, each pop is a promise
    * that is resolved with an existing element or an element that will be pushed in the future
    */
  var AsyncQueue: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.AsyncQueue[js.Object]]
  /**
    * Represents a binary search tree
    */
  var BinarySearchTree: org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      /* options */ adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
        adoneLib.adoneNs.collectionNs.BinarySearchTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    adoneLib.adoneNs.collectionNs.BinarySearchTree[js.Object, js.Object]
  ]
  /**
    * Represents a Node.js Buffer list collector, reader and streamer with callback/promise interface support
    */
  var BufferList: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.BufferList]
  /**
    * Represents an array of bytes, enhanced Node.js Buffer
    */
  var ByteArray: TypeofClassByteArray
  /**
    * Represents a Map that has a default values factory object or function.
    * Each get of non-existent key goes through the factory
    */
  var DefaultMap: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[
      (js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]) | (org.scalablytyped.runtime.StringDictionary[/* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any])
    ], 
    js.UndefOr[
      /* iterable */ stdLib.Iterable[
        js.Tuple2[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    adoneLib.adoneNs.collectionNs.DefaultMap[js.Object, js.Object]
  ]
  /**
    * Represents a faster LRU cache but with less functionality
    */
  var FastLRU: org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[/* options */ Anon_DisposeKey], 
    adoneLib.adoneNs.collectionNs.FastLRU[js.Object, js.Object]
  ]
  val INs: TypeofIBinarySearchTree
  /**
    * Represent an LRU cache
    */
  var LRU: org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      /* options */ adoneLib.adoneNs.collectionNs.INs.LRUNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]
    ], 
    adoneLib.adoneNs.collectionNs.LRU[js.Object, js.Object]
  ]
  /**
    * Represents a linked list
    */
  var LinkedList: TypeofClassLinkedList
  var MapCache: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.MapCache[js.Object]]
  var NSCache: org.scalablytyped.runtime.Instantiable2[
    /* maxSize */ scala.Double, 
    /* namespaces */ js.Array[java.lang.String], 
    adoneLib.adoneNs.collectionNs.NSCache[js.Object]
  ]
  /**
    * Represents a priority queue
    */
  var PriorityQueue: TypeofClassPriorityQueue
  /**
    * Represents a queue
    */
  var Queue: TypeofClassQueue
  /**
    * Represents a fully persistent red-black tree
    */
  var RedBlackTree: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[
      /* compare */ js.Function2[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* a */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* b */ js.Any, 
        scala.Double
      ]
    ], 
    js.UndefOr[
      /* root */ adoneLib.adoneNs.collectionNs.RedBlackTree[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]
    ], 
    adoneLib.adoneNs.collectionNs.RedBlackTree[js.Object, js.Object]
  ]
  var RefcountedCache: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.RefcountedCache[js.Object]]
  var Set: org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      /* key */ js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* x */ js.Any, 
        js.Any
      ]
    ], 
    adoneLib.adoneNs.collectionNs.Set[js.Object]
  ]
  /**
    * Represents a stack
    */
  var Stack: TypeofClassStack
  /**
    * Represents a Map that keeps keys only for a specified interval of time
    */
  var TimeMap: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[/* timeout */ scala.Double], 
    js.UndefOr[
      /* callback */ js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
        scala.Unit
      ]
    ], 
    adoneLib.adoneNs.collectionNs.TimeMap[js.Object, js.Object]
  ]
}

object Typeofcollection {
  @scala.inline
  def apply(
    AVLTree: org.scalablytyped.runtime.Instantiable1[
      js.UndefOr[
        /* options */ adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
          adoneLib.adoneNs.collectionNs.AVLTree[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
          ]
        ]
      ], 
      adoneLib.adoneNs.collectionNs.AVLTree[js.Object, js.Object]
    ],
    ArraySet: TypeofClassArraySet,
    AsyncQueue: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.AsyncQueue[js.Object]],
    BinarySearchTree: org.scalablytyped.runtime.Instantiable1[
      js.UndefOr[
        /* options */ adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
          adoneLib.adoneNs.collectionNs.BinarySearchTree[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
          ]
        ]
      ], 
      adoneLib.adoneNs.collectionNs.BinarySearchTree[js.Object, js.Object]
    ],
    BufferList: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.BufferList],
    ByteArray: TypeofClassByteArray,
    DefaultMap: org.scalablytyped.runtime.Instantiable2[
      js.UndefOr[
        (js.Function1[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]) | (org.scalablytyped.runtime.StringDictionary[/* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any])
      ], 
      js.UndefOr[
        /* iterable */ stdLib.Iterable[
          js.Tuple2[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
          ]
        ]
      ], 
      adoneLib.adoneNs.collectionNs.DefaultMap[js.Object, js.Object]
    ],
    FastLRU: org.scalablytyped.runtime.Instantiable1[
      js.UndefOr[/* options */ Anon_DisposeKey], 
      adoneLib.adoneNs.collectionNs.FastLRU[js.Object, js.Object]
    ],
    INs: TypeofIBinarySearchTree,
    LRU: org.scalablytyped.runtime.Instantiable1[
      js.UndefOr[
        /* options */ adoneLib.adoneNs.collectionNs.INs.LRUNs.ConstructorOptions[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ], 
      adoneLib.adoneNs.collectionNs.LRU[js.Object, js.Object]
    ],
    LinkedList: TypeofClassLinkedList,
    MapCache: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.MapCache[js.Object]],
    NSCache: org.scalablytyped.runtime.Instantiable2[
      /* maxSize */ scala.Double, 
      /* namespaces */ js.Array[java.lang.String], 
      adoneLib.adoneNs.collectionNs.NSCache[js.Object]
    ],
    PriorityQueue: TypeofClassPriorityQueue,
    Queue: TypeofClassQueue,
    RedBlackTree: org.scalablytyped.runtime.Instantiable2[
      js.UndefOr[
        /* compare */ js.Function2[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* a */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* b */ js.Any, 
          scala.Double
        ]
      ], 
      js.UndefOr[
        /* root */ adoneLib.adoneNs.collectionNs.RedBlackTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ], 
      adoneLib.adoneNs.collectionNs.RedBlackTree[js.Object, js.Object]
    ],
    RefcountedCache: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.RefcountedCache[js.Object]],
    Set: org.scalablytyped.runtime.Instantiable1[
      js.UndefOr[
        /* key */ js.Function1[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* x */ js.Any, 
          js.Any
        ]
      ], 
      adoneLib.adoneNs.collectionNs.Set[js.Object]
    ],
    Stack: TypeofClassStack,
    TimeMap: org.scalablytyped.runtime.Instantiable2[
      js.UndefOr[/* timeout */ scala.Double], 
      js.UndefOr[
        /* callback */ js.Function1[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
          scala.Unit
        ]
      ], 
      adoneLib.adoneNs.collectionNs.TimeMap[js.Object, js.Object]
    ]
  ): Typeofcollection = {
    val __obj = js.Dynamic.literal(AVLTree = AVLTree, ArraySet = ArraySet, AsyncQueue = AsyncQueue, BinarySearchTree = BinarySearchTree, BufferList = BufferList, ByteArray = ByteArray, DefaultMap = DefaultMap, FastLRU = FastLRU, INs = INs, LRU = LRU, LinkedList = LinkedList, MapCache = MapCache, NSCache = NSCache, PriorityQueue = PriorityQueue, Queue = Queue, RedBlackTree = RedBlackTree, RefcountedCache = RefcountedCache, Set = Set, Stack = Stack, TimeMap = TimeMap)
  
    __obj.asInstanceOf[Typeofcollection]
  }
}

